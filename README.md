# Attestr Android SDK

[![Platform](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)]

## Installation

### Maven users

Add this dependency to your project:

```xml
<dependency>
 <groupId>com.attestr</groupId>
 <artifactId>attestr-java</artifactId>
 <version>1.0</version>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
implementation "com.attestr:flowx:1.0"
```

## Usage

Create new object of AttestrFlowx

```java
AttestrFlowx attestrFlowx = new AttestrFlowx();
```

Initialize AttestrFlowx with client_key, handshake_id & activity

```java
// Initialize AttestrFlowx
attestrFlowx.init(clientKey, handShakeID, this);
```

Launch AttestrFlowx with locale and retry,
	locale - String (en for English & hi for Hindi) 
	retry - boolean 

```java
// Launch AttestrFlowx 
attestrFlowx.launch(locale, retry);
```

For Success, Failure & Skip flow events

```java
// Implement AttestrFlowXEventListener 
public class ExampleActivity implements AttestrFlowXEventListener
```
