# SLA Policy - jBPM Case Management


A case project sample with a SLA policy defined

This sample project shows as a SLA policy with a priority and a resolution duration can be attached to a case; when the SLA policy is elapsed a human task (Task Two) is created.

Task Two is delegated to an escalation groups (or groups) after a period (configurable)

![alt text](https://github.com/hifly81/slapolicy-sample/blob/master/src/main/resources/com/redhat/slapolicy_example/slapolicy-example.SLA_policy_sample-svg.svg)

## SLA Policy - usage

Start a case with:

```
curl -X POST "http://<ip>/kie-server/services/rest/server/containers/<container_id>/cases/<case_definition_id>/instances" -H  "accept: application/xml" -H  "content-type: application/json" -d '{"case-group-assignments": {"Staff": "Staff"},"case-data": {"slaPolicy":                 {"name": "urgent_sla","description": "urgent_sla","priority": "HIGH", "resolutionDuration": "PT300S", "escalation": {"groups": "Staff","waitingTimeBeforeEscalate": "PT30S"}}}}"
```

resolutionDuration is a ISO-8601 date format<br>
waitingTimeBeforeEscalate is a ISO-8601 date format
