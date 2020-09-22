create or replace view
assessment_view as
select a.assessment_id,a.no_of_sections ,a.specialization ,a.assessment_level ,a.assessment_name ,a.keywords ,a.role ,a.time ,
(select json_agg(section) from (select * from section s where a.assessment_id=s.assessment_id)section)as sections,
(select json_agg(question) from (select * from question_prop q where a.assessment_id=q.assessment_id )question)as questions, 
acs.accessbility,acs.negative_mark ,
dis.objectjson, 
es.internet_issue,es.mic_issue,es.proctor_alert,es.server_issue,es.webcam_issue, 
ss.shortcut,ss.no_of_options ,ss.options ,
ts.themes,ts.modes 
from assessment a left join accessbility_settings acs on  a.assessment_id=acs.assessment_id 
left join display_settings dis on a.assessment_id=dis.assessment_id 
left join error_settings es on a.assessment_id=es.assessment_id
left join shortcut_settings ss on a.assessment_id=ss.assessment_id
left join theme_settings ts on ts.assessment_id=a.assessment_id; 