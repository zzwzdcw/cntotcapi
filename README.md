# 繁体简体转换API

## 简体转换繁体

### 简易的简体转换繁体

示例：http://localhost:10270/cntotcsimple?orgin=简易返回值的简体转繁体测试

返回值："簡易返回值的簡體轉繁體測試"

```json
"簡易返回值的簡體轉繁體測試"
```



### 简体转换繁体

示例：http://localhost:10270/cntotc?orgin=简体转繁体测试

返回值：

```json
{

  "result": "簡體轉繁體測試",

  "stat": "0",

  "message": "成功"

}
```



## 繁体转换简体

### 简易的繁体转换简体

示例：http://localhost:10270/tctocnsimple?orgin=繁體轉簡體測試

返回值：

```JSON
"繁体转简体测试"
```



### 繁体转换简体

示例：http://localhost:10270/tctocn?orgin=繁體轉簡體測試

返回值：

```json
{
    "result": "繁体转简体测试",
    "stat": "0",
    "message": "成功"
}
```

