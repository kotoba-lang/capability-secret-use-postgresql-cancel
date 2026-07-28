# capability-secret-use-postgresql-cancel

Atomic authority package for `secret/use-postgresql-cancel`.

- imports: `#{:pg-cancel-register :pg-cancel}`
- effects: `#{:secret :network-write}`
- default policy: `:approval-required`
- provider status: `contract-only`

Importing this package does not grant runtime authority. Tamaki must
request it explicitly and Kototama must admit the sealed envelope.

```sh
clojure -M:test
```
