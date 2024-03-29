# Spring MongoDB

### References

- https://www.mongodb.com/docs/manual/introduction/
- https://spring.io/guides/gs/accessing-data-mongodb/
- https://www.baeldung.com/spring-data-mongodb-tutorial

### install

~~~
brew tap mongodb/brew
brew install mongodb-community
~~~


### MongoDB Web Shell

- https://mws.mongodb.com/

### MongoDB Compass

~~~
brew install --cask mongodb-compass
~~~

## Features

- NoSQL
- 스키마 프리 
- 비 관계형 데이터베이스

기본적으로 SQL를 사용하지 않기 때문에 NoSQL로 분류하곤 하지만, SQL Driver를 사용하면 여타 RDBMS와 비슷하게 MongoDB와 통신할 수 있다.

또한 $loopUp 이라는 어그리게이션 기능을 사용하면 Join 처리를 비슷하게? 수행할 수 있다. 

SQL, NoSQL 경계가 허물어지는 것이 현재 추세인 것으로 보인다. 

<br>

스키마 프리가 MongoDB와 여타 다른 RDBMS를 구분 지어줄 가장 주요한 특징이다. 

스키마 프리는 컬럼 수준에 적용된다. 사용할 컬럼을 미리 정의하지 않고 필요한 시점에 데이터를 저장할수 있는 것을 의미한다.

하지만 MongoDB 인덱스를 구성하는 필드는 미리 정의해야 한다.




### 1. VS RDB

|RDBMS|MongoDB|
|-------|-------|
|Database|Database|
|Table|Collection|
|Row|Document|
|Column| Key / Field|



### 2. Document

Document 는 key-value 쌍으로 이루어져 있다. (json 구조)
동적 스키마 구조로, 동일한 컬렉션 내의 도큐먼트가 다른 필드, 구조를 가질 수 있다.


### 3. Collection

Collection 은 Document 의 그룹, 모음을 말한다.
동적 스키마 구조로, 동일한 컬렉션 내의 도큐먼트가 다른 필드, 구조를 가질 수 있다.
-> 굳이 Collection 을 여러개 만드는 이유??
- 데이터의 성격에 맞게 문서를 저장하는 것이 조회할 경우 더 효율적이고 분석에 용이한 어찌보면 당연한 이야기 




## MongoDB 스토리지 엔진 

현재 MongoDB 서버에서는 아래와 같이 다양한 스토리지 엔진을 사용할 수 있다.


| 기능            | MMAPv1      | WiredTiger | In-Memory | RocksDB       | TokuDB |
|------------|-------------|------------|--------|---------------|--------|
| 잠금수준          | 컬렉션         | 도큐먼트       | 도큐먼트   | 도큐먼트          | 도큐먼트   |
| 데이터 구조        | B-tree      | B-tree     | LSM    | Fractcal-Tree | 
| 빌트인 캐시        | X (운영체제 캐시) | O          | O      | O             |
| 세컨드리 인덱스      | O           | O          | O      | O             | O      |
| 데이터 압축        | X           | O          | O      | O             | O      |
| 인덱스 압축        | X           | O          | O        | X             | O      |
| 암호화           | X           | O          | X      | X             | X      |
| In-Memory 지원  | X           | O          | X      | X             | X      |
| 컬렉션 파티션       | X           | X          | X      | O             | O      |


MMAPv1 스토리지 엔진은 MongoDB가 처음 출시했을 때부터 사용되던 스토리지 엔진이다.
MMAPv1 제외한 모든 스토리지 엔진에서 도큐먼트 수준의 잠금을 지원하기 때문에 동시성 처리는 우수하다.
유일하게 TokuDB 컬렉션 파티션 기능도 제공한다. 여기서 파티션 기능은 컬렉션을 샤드 서버별로 분산하는 것을 의미하는 것이 아니라
주로 RDBMS에서 사용하는 파티션을 의미한다.
