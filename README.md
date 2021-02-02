# JPA_Security_WebProejct

 - Spring boot 기초 튜토리얼 교육용으로 만들고 있습니다.
  - Spring JPA & Security 기반으로 만드는 
  - 작업을 하면서 에러 뜨는 현상 또한 공유 할 것입니다.
  


----

 ## 에러 모음 
 
 
 > o.s.b.d.LoggingFailureAnalysisReporter : 해결 방법 resources 의 application.properties에 다음 문장 추가
  + spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
  
 >  JPA - GenerationTarget encountered exception accepting command : Error executing DDL 
   + application.yml generate-ddl: true로 변경하면 정상적으로 빌드가 완료 된다.
