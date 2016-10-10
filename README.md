# simple-giphy-java
###Java Library for the Giphy API

This library offers drop in Giphy functionality to your Java project, see simple-giphy-android for the 
Android specific version of this library which is coming soon. Usage between normal java and android will
be broken out since we may want to use the Parcelable interface in Android Projects.

![Giphy Attribution][giphy-logo]
[giphy-logo]: https://github.com/kylejablonski/simple-giphy-java/raw/master/images/Poweredby_640px-White_VertText.png "Giphy Attribution"

####Master branch build status: 
[![Build Status](https://travis-ci.org/kylejablonski/simple-giphy-java.svg?branch=master)](https://travis-ci.org/kylejablonski/simple-giphy-java)    
####JitPack version:
[![JitPack version](https://jitpack.io/v/kylejablonski/simple-giphy-java.svg)](https://jitpack.io/#kylejablonski/simple-giphy-java)


###Usage:

Maven Central is coming soon, however here is setup using jitpack

####Gradle:

>Step 1. Add the JitPack repository to your build file

```java
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

>Step 2. Add the dependency

```java
dependencies {
        compile 'com.github.kylejablonski:simple-giphy-java:1.0.0'
}
```

####Maven:

>Step 1. Add the JitPack repository to your build file

```xml
<repositories>
	<repository>
	    <id>jitpack.io</id>
	    <url>https://jitpack.io</url>
	</repository>
</repositories>
```

>Step 2. Add the dependency

```xml
<dependency>
    <groupId>com.github.kylejablonski</groupId>
    <artifactId>simple-giphy-java</artifactId>
    <version>1.0.0</version>
</dependency>
```

###Library Usage:

####Example: Trending Request

```java
// Set up your API Key
SimpleGiphy.setApiKey("Your-API-KEY");

// Call to get trending giphy's limit is 50, content rating is pg-13
GiphyListResponse trendingResponse = SimpleGiphy.getInstance().trending("50", "pg-13");

// Get access to the List<Giphy>
List<Giphy> trendingList = trendingResponse.getData();
```

Please see SimpleGiphyTest.java for a full look at the Supported Methods in this Library or consult the Javadoc