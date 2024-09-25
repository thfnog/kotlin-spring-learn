# TasksController

TasksController


---
## create

> BASIC

**Path:** /v1/tasks

**Method:** POST

> REQUEST

**Headers:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| Content-Type | application/json | YES |  |

**Request Body:**

| name | type | desc |
| ------------ | ------------ | ------------ |
| id | integer |  |
| name | string |  |
| status | string |  |

**Request Demo:**

```json
{
  "id": 0,
  "name": "",
  "status": ""
}
```




---
## update

> BASIC

**Path:** /v1/tasks

**Method:** POST

> REQUEST

**Headers:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| Content-Type | application/json | YES |  |

**Query:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| id |  | YES |  |

**Request Body:**

| name | type | desc |
| ------------ | ------------ | ------------ |
| id | integer |  |
| name | string |  |
| status | string |  |

**Request Demo:**

```json
{
  "id": 0,
  "name": "",
  "status": ""
}
```




---
## getAll

> BASIC

**Path:** /v1/tasks

**Method:** GET

> REQUEST



> RESPONSE

**Headers:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| content-type | application/json;charset=UTF-8 | NO |  |

**Body:**

| name | type | desc |
| ------------ | ------------ | ------------ |
|  | array |  |
|  | object |  |
| &ensp;&ensp;&#124;─id | integer |  |
| &ensp;&ensp;&#124;─name | string |  |
| &ensp;&ensp;&#124;─status | string |  |

**Response Demo:**

```json
[
  {
    "id": 0,
    "name": "",
    "status": ""
  }
]
```




---
## delete

> BASIC

**Path:** /v1/tasks

**Method:** POST

> REQUEST

**Headers:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| Content-Type | application/x-www-form-urlencoded | YES |  |

**Query:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| id |  | YES |  |



