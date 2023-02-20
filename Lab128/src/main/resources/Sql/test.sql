select a.tablespace_name AS TABLESPACENAME,
       sum(a.total) 	 AS MAXSIZE,
       sum(a.realsize) - sum(b.free) AS USED,
       round((sum(a.realsize) - sum(b.free)) / sum(a.total) * 100, 1) AS USEDPER
  from (select tablespace_name,
  			   case when AUTOEXTENSIBLE='YES' then round(sum(maxbytes)/1024/1024,0)
					else round(sum(bytes)/1024/1024,0) end total,
			   round(sum(bytes)/1024/1024,0) as realsize
          from dba_data_files
         where tablespace_name not in (select tablespace_name
                  from dba_tablespaces
                 where contents like 'UNDO%')
         group by tablespace_name , AUTOEXTENSIBLE ) a,
       (select tablespace_name,
               round(sum(bytes)/1024/1024, 0) free
          from dba_free_space
         where tablespace_name not in (select tablespace_name
                  from dba_tablespaces
                 where contents like 'UNDO%')
         group by tablespace_name ) b
 where a.tablespace_name = b.tablespace_name(+)
 group by a.tablespace_name
 order by 3 desc;