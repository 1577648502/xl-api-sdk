<p align="center">
    <img src=http://110.41.132.124:9000/public/KgKkdTOM-WX20230508-175957%402x.png width=188/>
</p>

<h1 align="center">Xl-API-SDK</h1>
<p align="center"><strong>Xl-API 接口开放平台开发者工具包</strong></p>

<div align="center">
    <img alt="Maven" src="https://raster.shields.io/badge/Maven-3.8.1-red.svg"/>
   <img alt="SpringBoot" src="https://raster.shields.io/badge/SpringBoot-2.7+-green.svg"/>
  <a href="https://github.com/1577648502/xl-api-sdk" target="_blank"><img src='https://img.shields.io/github/forks/1577648502/xl-api-sdk' alt='GitHub forks' class="no-zoom"></a>
  <a href="https://github.com/1577648502/xl-api-sdk" target="_blank"><img src='https://img.shields.io/github/stars/1577648502/xl-api-sdk' alt='GitHub stars' class="no-zoom"></a>
</div>
### 目录结构 📝

```text
qiapisdk
    ├─client
    ├─config
    ├─exception
    ├─model
    │  ├─enums
    │  ├─params
    │  ├─request
    │  └─response
    ├─service
    │  └─impi
    └─utils
```

### 导航 🧭

- **[Xl-API 接口开放平台 🔗](http://110.41.132.124:88)**
- **[Xl-API-DOC 开发者文档 📖](http://110.41.132.124:89)**

###  快速开始 🚀

**要开始使用 Xl-API-SDK，您需要按照以下简单进行操作:**

#### 1. 引入依赖坐标

```xml
<dependency>
   <groupId>com.lfg</groupId>
   <artifactId>xl-api-sdk</artifactId>
   <version>0.0.1</version>
</dependency>   
```


#### 2. 前往[Xl-API 接口开放平台](http://110.41.132.124:88) 获取开发者密钥对

#### 3. 初始化客户端XlApiClient对象

- 方法 1 ：主动实例化客户端

  ```java
  String accessKey = "你的 accessKey";
  String secretKey = "你的 secretKey";
  XlApiClient client = new XlApiClient(accessKey, secretKey);
  ```

- 方法 2 ：通过配置文件注入对象

  - yml

    ```yml
    # Xl-API 配置
    qi:
      api:
        client:
          access-key: 你的 accessKey
          secret-key: 你的 secretKey
          # 本地网关地址，可修改为自己的网关，用于本地测试，线上网关地址等，不配置默认平台的网关
         # host: http://localhost:8090/api
    ```
    
  - properties
  
    ```properties
    qi.api.client.access-key=你的 accessKey
    qi.api.client.secret-key=你的 secretKey
    ```

#### 4. 使用API服务

   ```java
    @Resource
    private ApiService apiService;
   ```

#### 5. 发起请求示例

示例：随机毒鸡汤

- 示例一 ：**通过配置文件 推荐👍**

```java
try {
    PoisonousChickenSoupResponse poisonousChickenSoup = apiService.getPoisonousChickenSoup();
    System.out.println("poisonousChickenSoup = " + poisonousChickenSoup);
} catch (ApiException e) {
  log.error(e.getMessage());
}
```

- 示例二 ：主动注入
```java
try {
    XlApiClient xlApiClient = new XlApiClient("你的 accessKey", "你的 secretKey");
    PoisonousChickenSoupResponse poisonousChickenSoup = apiService.getPoisonousChickenSoup(xlApiClient);
    System.out.println("poisonousChickenSoup = " + poisonousChickenSoup);
} catch (ApiException e) {
    log.error(e.getMessage());
}
```

响应：

```json
{
  "text": "不知道你混什么圈，反正我的是混黑眼圈。"
}
```

- **更多接口详见：[Xl-API-DOC 开发者文档](http://110.41.132.124:89)**

### 贡献 🤝

如果您想为 **[Xl-API 接口开放平台](http://110.41.132.124:88)**  做出贡献，请随时提交拉取请求。我们始终在寻找方法来改进项目，使其对像您这样的开发者更有用。

### 联系我们 📩

如果您对 **[Xl-API 接口开放平台](http://110.41.132.124:88)**  平台有任何问题或建议，请随时联系我们:📩邮箱：1577648502@qq.com。

感谢您使用 **[Xl-API 接口开放平台](http://110.41.132.124:88)**  ！ 😊
