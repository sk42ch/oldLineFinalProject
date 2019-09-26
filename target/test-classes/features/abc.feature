@homepage @web
  Feature:

      Background:
        Given :

        @signup
        Scenario: Verify error signup
          Given im on login page
          When i enter username
          Then i enter password
