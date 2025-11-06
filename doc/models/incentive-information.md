
# Incentive Information

The incentive details.

## Structure

`IncentiveInformation`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `IncentiveDetails` | [`List<IncentiveDetails>`](../../doc/models/incentive-details.md) | Optional | An array of incentive details.<br><br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `32767` | List<IncentiveDetails> getIncentiveDetails() | setIncentiveDetails(List<IncentiveDetails> incentiveDetails) |

## Example (as JSON)

```json
{
  "incentive_details": [
    {
      "incentive_type": "incentive_type4",
      "incentive_code": "incentive_code0",
      "incentive_amount": {
        "currency_code": "currency_code4",
        "value": "value0"
      },
      "incentive_program_code": "incentive_program_code4"
    },
    {
      "incentive_type": "incentive_type4",
      "incentive_code": "incentive_code0",
      "incentive_amount": {
        "currency_code": "currency_code4",
        "value": "value0"
      },
      "incentive_program_code": "incentive_program_code4"
    },
    {
      "incentive_type": "incentive_type4",
      "incentive_code": "incentive_code0",
      "incentive_amount": {
        "currency_code": "currency_code4",
        "value": "value0"
      },
      "incentive_program_code": "incentive_program_code4"
    }
  ]
}
```

