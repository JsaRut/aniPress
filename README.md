# 介绍

此套主题主要是将 WordPress 改造成纯 api 的站点，以便实现前后端分离的技术栈，唯一的问题就是需要安装 JWT token 插件

由于文档站尚未编写，安装/使用与上游保持一致

### 功能介绍

1. 支持豆瓣以及 bangumi 的一键获取动漫信息, 豆瓣 API 目前使用的是第三方代理 可能有失效的风险.

2. 用户云端历史纪录，收藏记录，点赞记录等等。

3. 前后端分离，针对 WordPress 进行了大量的定制化，使其成为一个纯 api 输出的后台，前台因此可以部署在各个地方.

### 目录结构

```js
|---qinpress   // wordpress主题文件
|---web        // pc 端文件
|---h5         // 移动端文件
|---picture    // 图片相关
```

### 安装须知

目前的 wordpress5.0 版本以上的使用了最新的编辑器, 会导致无法发布的问题,解决方法: 使用经典编辑器插件换回旧的编辑器, 或者直接使用 4.9 版本的 WP;

### 主题大致结构

```js
主题结构示例
|----api.example.com    //wp 主站点，提供 api 后台管理等等
|----www.example.com    //PC 主站点，电脑访问自动跳转
|----m.example.com      //移动端主题站点，自动跳转
```
### To Do
The Movie DB API 获取动漫信息

修复豆瓣、Bangumi 无法获取动漫信息的 BUG

编写文档站

### 主题预览

![picture](https://raw.githubusercontent.com/Qinmei/qinpress/3.0/picture/18.PNG)
![picture](https://raw.githubusercontent.com/Qinmei/qinpress/3.0/picture/19.PNG)
![picture](https://raw.githubusercontent.com/Qinmei/qinpress/3.0/picture/20.PNG)
![picture](https://raw.githubusercontent.com/Qinmei/qinpress/3.0/picture/21.PNG)
![picture](https://raw.githubusercontent.com/Qinmei/qinpress/3.0/picture/22.PNG)
![picture](https://raw.githubusercontent.com/Qinmei/qinpress/3.0/picture/23.PNG)
![picture](https://raw.githubusercontent.com/Qinmei/qinpress/3.0/picture/24.PNG)
![picture](https://raw.githubusercontent.com/Qinmei/qinpress/3.0/picture/25.PNG)
![picture](https://raw.githubusercontent.com/Qinmei/qinpress/3.0/picture/26.PNG)
