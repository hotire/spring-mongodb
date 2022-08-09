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





