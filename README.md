# JPA_Security_WebProejct

 - Spring boot 기초 튜토리얼 교육용으로 만들고 있습니다.
  - Spring JPA & Security 기반으로 만들 예정
  - 작업을 하면서 에러 뜨는 현상 또한 공유 할 것입니다.
  


----

 ## 에러 모음 
 
 
 > o.s.b.d.LoggingFailureAnalysisReporter : 해결 방법 resources 의 application.properties에 다음 문장 추가
  + spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
  
 >  JPA - GenerationTarget encountered exception accepting command : Error executing DDL 
   + application.yml generate-ddl: true로 변경하면 정상적으로 빌드가 완료 된다.
   
   
 > My Sql servr error
  + ERROR! The server quit without updating PID file (/usr/local/var/mysql/...)
    - 1. Mysql 인스턴스가 실행 중인지 확인 : $ ps -ef | grep mysql
    - 2. kill -15 PID
    - 3. ls -laF /usr/local/var/mysql
    - 4. 소유자를 mysql로 변경 : sudo chown -R mysql /usr/local/var/mysql
