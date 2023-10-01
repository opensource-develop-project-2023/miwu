# miwu
여행 추천 웹 애플리케이션

csv컨트롤러에 csv수만큼 추가하고 각 csv별로 엔티티, 레포지토리, 컨트롤러를 만들어서 주소창에 ../busan, ../daegu 이런식으로 입력하면 각 지역별로 테이블이 데이터베이스에 들어감.
ㄴ 이게맞는지 모르겠음

destination 테이블에 모든 csv 데이터를 넣을려고 했지만 mySQL에서 확인하면 1000개밖에 안나와서 확인해보니까 최대 컬럼수 가 1000개정도로 제한되어있어서 다시 각 csv별로 테이블을 만듬.

실행 후 아래 주소들을 전부 입력해서 데이터베이스에 각 csv별로 테이블이 생성되서 데이터가 들어가게됨
http://localhost:8080/destination //전국
http://localhost:8080/busan //부산
http://localhost:8080/daegu //대구
http://localhost:8080/daejeon //대전
http://localhost:8080/gangju //광주
http://localhost:8080/gunggido //경기도
http://localhost:8080/incheon //인천
http://localhost:8080/sejong //세종
http://localhost:8080/seoul //서울
http://localhost:8080/ulsan //울산
