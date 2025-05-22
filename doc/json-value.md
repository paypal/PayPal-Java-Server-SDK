
# JsonValue

Class to wrap any JSON value.

## Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `fromString(String value)` | Initializes JsonValue instance with string value. | `JsonValue` |
| `fromBoolean(Boolean value)` | Initializes JsonValue instance with boolean value. | `JsonValue` |
| `fromInteger(Integer value)` | Initializes JsonValue instance with integer value. | `JsonValue` |
| `fromLong(Long value)` | Initializes JsonValue instance with long value. | `JsonValue` |
| `fromDouble(Double value)` | Initializes JsonValue instance with double value. | `JsonValue` |
| `fromObject(Object value)` | Initializes JsonValue instance with any object value. | `JsonValue` |
| `fromArray(List<T> values)` | Initializes JsonValue instance with array of any type. | `JsonValue` |
| `getStoredObject()` | Getter for stored object. | `Object` |
| `toString()` | String representation of stored JSON. | `String` |

