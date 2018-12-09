# smart-date-string

![apache licensed](https://img.shields.io/badge/License-Apache_2.0-d94c32.svg)
![Java](https://img.shields.io/badge/Language-Java-f88909.svg)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/jp.spring-boot-reference/smart-date-string/badge.svg)](https://maven-badges.herokuapp.com/maven-central/jp.spring-boot-reference/smart-date-string)

https://search.maven.org/artifact/jp.spring-boot-reference/smart-date-string/1.1/jar
https://oss.sonatype.org/content/repositories/releases/jp/spring-boot-reference/smart-date-string/


## Usage
you can generate date string easily like below.
### date string generate 
```Java
// generate date string (in this case, returned time is when you execute this method.)
SmartDateString.generate("yyyy/MM/dd");
// 2018/12/09

// generate date string from timezone data
SmartDateString.generate("yyyy/MM/dd hh:mm:ss",TimeZone.getTimeZone("Asia/Tokyo"));
// 2018/12/09 07:42:40

// you can set year, month and date
SmartDateString.generate("yyyy/MM/dd",2019,09);
// 2019/09/09

// generate date string from calender object
SmartDateString.generate("yyyy/MM/dd hh:mm:ss",Calender.getInstance());
// 2018/12/09 07:42:40
```

### date calculation
```Java
// you can get previous day
SmartDateString.generatePreviousDay("yyyy/MM/dd hh:mm:ss",100)
// 2018/08/31 07:42:40

// you can get later day
SmartDateString.generateLaterDay("yyyy/MM/dd hh:mm:ss",100)
// 2019/03/19 07:42:40

// generate calcucation result from calender, or date object 
SmartDateString.generatePreviousDay("yyyy/MM/dd hh:mm:ss",100,Calender.getInstance());
// 2018/08/31 07:42:40
SmartDateString.generateLaterDay("yyyy/MM/dd hh:mm:ss",120,new Date());
// 2019/04/08 07:42:40

```

## Dependency
**Maven**
```xml
<dependency>
    <groupId>jp.spring-boot-reference</groupId>
    <artifactId>smart-date-string</artifactId>
    <version>1.0</version>
</dependency>
```

**Gradle**
```gradle
compile 'jp.spring-boot-reference:smart-date-string:1.0'
```
