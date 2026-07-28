(ns kotoba.capability.secret.use-postgresql-cancel
  "Importable contract for secret/use-postgresql-cancel.")

(def manifest
  {:schema "kotoba.capability.repository.v1", :capability/version 1, :capability/dependencies #{}, :capability/imports #{:pg-cancel-register :pg-cancel}, :authority "kotoba-lang/kotoba-core-contracts", :capability/default-policy :approval-required, :capability/artifact {:format :wasm-component, :digest-required? true, :signature-required? true}, :capability/radicle-rid nil, :capability/repository "kotoba-lang/capability-secret-use-postgresql-cancel", :capability/id "secret/use-postgresql-cancel", :capability/effects #{:secret :network-write}, :capability/provider-status :contract-only})
