#drop table if exists UMB_PERSON;

# 自然人;
create table UMB_PERSON
(
   PERSON_ID            numeric(10,0) not null /* 人员ID */,
   NAME                 varchar(100) /* 姓名 */,
   EMPLOYEE_ID          numeric(10,0) /* 缺省员工ID */,
   GENDER               char(1) /* 性别 */,
   BIRTH_DATE           char(8) /* 出生日期 */,
   MOBILE_NO            varchar(15) /* 移动电话 */,
   COUNTRY_ALPHA_ID     varchar(3) /* 家庭所在国家 */,
   STATE_ID             varchar(10) /* 家庭所在省 */,
   CITY_ID              varchar(10) /* 家庭所在城市 */,
   HOME_ADDRESS1        varchar(40) /* 家庭地址行1 */,
   HOME_ADDRESS2        varchar(40) /* 家庭地址行2 */,
   HOME_ADDRESS3        varchar(40) /* 家庭地址行3 */,
   HOME_ADDRESS4        varchar(40) /* 家庭地址行4 */,
   HOME_TELPHONE        varchar(15) /* 家庭电话 */,
   HOME_POST_CODE       varchar(10) /* 家庭邮编 */,
   EMAIL                varchar(40) /* 邮件地址 */,
   primary key (PERSON_ID)
);
