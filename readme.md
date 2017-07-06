Loose Rules Work Item Handler
=============================

The purpose of this Work Item Handler is to call rules from a loosely coupled project.
It is designed and tested on Red Hat JBoss BPMS v6.4.3.

The Work Item Handler is defined in the following maven project:

- loose-rules-wih

The following folder contains a set of metadata files to easily install the Work Item Handler:

- services-repo

The remaining projects are a sample to test the Work Item Handler:

- rule-fact-model : a shared fact model shared among the rules and the rules client (the process)
- rules : a sample decision table to be used by the WIH
- rules-proc : a process that uses the WIH

Installation procedure
----------------------

1. Launch maven install for all the projects following this order
  - rule-fact-model
  - rules
  - loose-rules-wih
  - rules-proc

2. Place the rule-fact-model jar at high level of Classloader hierarchy in a way that can be shared among the rules and the process. For JBoss EAP, you can place in the `WEB-INF/lib` of the BPMS runtime
3. Launch the process
