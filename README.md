# api-automation-core
A convenient,highly encapsulated request jar for testing Restful APIs.

# Installation

* __Java(JDK 1.7+)__
* __Maven(3.3+)__

# Why you should choose this jar?
1. __The request methods are based on Rest-Assured, a very popular request lib for testing Restful API;__
2. __The methods provided in this jar are highly encapsulated, you don't need to encapsulate Rest-Assured again by yourself when you want to test APIs;__
3. __The jar also integrates with Allure internally, a very popular automation HTML report, if you use Allure report in your automation framework, the jar will add some steps/information to Allure report automatically;__
4. __Spring Boot style and methods are well tested by unit test in the jar;__
5. __Open source and well maintained by Dylan Zhang, A Senior TA from eHealth;__

# Which areas can you use this jar?

* __Your API automation framework;__
* __Your UI/E2E automation framework;__
* __Anywhere you want to call APIs;__
* __etc.__

# How to use this jar?

1. __Import jar in your project's pom.xml__
```
    <dependency>
        <groupId>com.github.dylanz666</groupId>
        <artifactId>api-automation-core</artifactId>
        <version>1.0.0</version>
    </dependency>
```
2. __Use methods provided by the jar;__
* __GET API:__
```
...
@Autowired
private RequestController requestController;
...

int count = 2;
String url = "https://api.apiopen.top/getJoke?page=1&count=%d&type=video";
url = String.format(url, count);

RequestSpec requestSpec = new RequestSpec();
requestSpec.setUrl(url);
requestSpec.setMethod(MethodEnum.GET);

Response response = requestController.launch(requestSpec);

Assert.assertEquals(200, response.getStatusCode());
Assert.assertEquals(200, JSONObject.parseObject(response.asString()).getIntValue("code"));
Assert.assertEquals(count, JSONObject.parseObject(response.asString()).getJSONArray("result").size());
```

* __POST API:__
```
TBD
```

* __PUT API:__
```
TBD
```

* __DELETE API:__
```
TBD
```

* __PATCH API:__
```
TBD
```