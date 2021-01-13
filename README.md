# blog

 - Spring boot 기초 튜토리얼 교육용으로 만들고 있습니다.
  - Spring JPA & Security 기반으로 만드는 Blog


----

 ## 에러 모음 
 
 
 - o.s.b.d.LoggingFailureAnalysisReporter : 해결 방법 resources 의 application.properties에 다음 문장 추가
  - spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
