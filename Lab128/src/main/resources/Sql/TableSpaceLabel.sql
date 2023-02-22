-- Total Count
select (select count(*) from v$tablespace) AS TABLESPACES, 
       round((c.tbssize+e.tmpsize)/1024/1024/1024,2) AS TOTAL,
       round((c.tbssize-d.freesize)/1024/1024/1024,2) AS USEDGB,
       (select count(*) from dba_triggers where status!='ENABLED' and owner not in ('SYS','SYSTEM')) AS TRIGGERS,  
       (select case when count(*)=0 then null 
                    when count(*) > 0 then count(*)||' unusable indexes.' end "Index Check"
          from dba_indexes where status='UNUSABLE') AS INDEXES
  from (select sum(bytes) as tbssize from dba_data_files)  c,
       (select sum(bytes) as freesize from dba_free_space) d,
       (select sum(bytes) as tmpsize from dba_Temp_files) e;