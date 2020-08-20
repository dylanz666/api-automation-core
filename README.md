# api-automation-core
A highly encapsulated,convenient request jar for testing Restful APIs.

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
2. __Use methods provided by the jar in your project;__
* __GET API:__
```
...
import com.github.dylanz666.util.Assert;
...
@Autowired
private RequestController requestController;
...
String name = "test1";
String url = "https://postman-echo.com/get?name=%s";
url = String.format(url, name);

RequestSpec requestSpec = new RequestSpec();
requestSpec.setUrl(url);
requestSpec.setMethod(MethodEnum.GET);

Response response = requestController.launch(requestSpec);

Assert.assertEquals(response.getStatusCode(), 200);
Assert.assertEquals(JSONObject.parseObject(response.asString()).getString("url"), url);
Assert.assertEquals(JSONObject.parseObject(response.asString()).getJSONObject("args").getString("name"), name);
```

* __POST API:__
```
...
import com.github.dylanz666.util.Assert;
...
@Autowired
private RequestController requestController;
...
String name = "test2";
String url = "https://postman-echo.com/post";
JSONObject body = new JSONObject();
body.put("method", MethodEnum.POST.toString());
body.put("name", name);

RequestSpec requestSpec = new RequestSpec();
requestSpec.setUrl(url);
requestSpec.setMethod(MethodEnum.POST);
requestSpec.setRequestBody(body.toString());

Response response = requestController.launch(requestSpec);

Assert.assertEquals(response.getStatusCode(), 200);
Assert.assertEquals(JSONObject.parseObject(response.asString()).getString("url"), url);
Assert.assertEquals(JSONObject.parseObject(response.asString()).getJSONObject("data").getString("method"), MethodEnum.DELETE.toString());
Assert.assertEquals(JSONObject.parseObject(response.asString()).getJSONObject("data").getString("name"), name);
Assert.assertEquals(JSONObject.parseObject(response.asString()).getJSONObject("json").getString("method"), MethodEnum.DELETE.toString());
Assert.assertEquals(JSONObject.parseObject(response.asString()).getJSONObject("json").getString("name"), name);
```

* __PUT API:__
```
...
import com.github.dylanz666.util.Assert;
...
@Autowired
private RequestController requestController;
...
String name = "test3";
String url = "https://postman-echo.com/put";
JSONObject body = new JSONObject();
body.put("method", MethodEnum.PUT.toString());
body.put("name", name);

RequestSpec requestSpec = new RequestSpec();
requestSpec.setUrl(url);
requestSpec.setMethod(MethodEnum.PUT);
requestSpec.setRequestBody(body.toString());

Response response = requestController.launch(requestSpec);

Assert.assertEquals(response.getStatusCode(), 200);
Assert.assertEquals(JSONObject.parseObject(response.asString()).getString("url"), url);
Assert.assertEquals(JSONObject.parseObject(response.asString()).getJSONObject("data").getString("method"), MethodEnum.DELETE.toString());
Assert.assertEquals(JSONObject.parseObject(response.asString()).getJSONObject("data").getString("name"), name);
Assert.assertEquals(JSONObject.parseObject(response.asString()).getJSONObject("json").getString("method"), MethodEnum.DELETE.toString());
Assert.assertEquals(JSONObject.parseObject(response.asString()).getJSONObject("json").getString("name"), name);
```

* __DELETE API:__
```
...
import com.github.dylanz666.util.Assert;
...
@Autowired
private RequestController requestController;
...
String name = "test4";
String url = "https://postman-echo.com/delete";
JSONObject body = new JSONObject();
body.put("method", MethodEnum.DELETE.toString());
body.put("name", name);

RequestSpec requestSpec = new RequestSpec();
requestSpec.setUrl(url);
requestSpec.setMethod(MethodEnum.DELETE);
requestSpec.setRequestBody(body.toString());

Response response = requestController.launch(requestSpec);

Assert.assertEquals(response.getStatusCode(), 200);
Assert.assertEquals(JSONObject.parseObject(response.asString()).getString("url"), url);
Assert.assertEquals(JSONObject.parseObject(response.asString()).getJSONObject("data").getString("method"), MethodEnum.DELETE.toString());
Assert.assertEquals(JSONObject.parseObject(response.asString()).getJSONObject("data").getString("name"), name);
Assert.assertEquals(JSONObject.parseObject(response.asString()).getJSONObject("json").getString("method"), MethodEnum.DELETE.toString());
Assert.assertEquals(JSONObject.parseObject(response.asString()).getJSONObject("json").getString("name"), name);
```

* __PATCH API:__
```
//Like post,put,delete;
```