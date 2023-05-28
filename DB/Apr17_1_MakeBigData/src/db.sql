-- openweathermap
-- 테이블 명 : seoul_weather
-- 컬럼 : 시간/날씨/기온/체감기온/최저기온/최고기온/기압/습도

create table seoul_weather (
	sw_when date primary key,
	sw_description varchar2(20 char) not null,
	sw_temp number(4,2) not null,
	sw_feels_like number(4,2) not null,
	sw_temp_min number(4,2) not null,
	sw_temp_max number(4,2) not null,
	sw_pressure number(4) not null,
	sw_humidity number(3) not null
);

create sequence seoul_weather_seq;

drop table seoul_weather cascade constraint purge;
drop sequence seoul_weather_seq;

insert into SEOUL_WEATHER values(sysdate, '맑음', 14, 15, 5, 23, 1028, 45);
select * from SEOUL_WEATHER order by sw_when;
truncate table seoul_weather;
select * from SEOUL_WEATHER
