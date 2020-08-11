plugins {
  id("org.hypertrace.repository-plugin") version "0.1.2"
  id("org.hypertrace.ci-utils-plugin") version "0.1.1"
  id("org.hypertrace.jacoco-report-plugin") version "0.1.0" apply false
  id("org.hypertrace.docker-java-application-plugin") version "0.4.0" apply false
  id("org.hypertrace.docker-publish-plugin") version "0.4.0" apply false
  id("org.hypertrace.integration-test-plugin") version "0.1.0" apply false
}

subprojects {
  group = "org.hypertrace.core.bootstrapper"
}
