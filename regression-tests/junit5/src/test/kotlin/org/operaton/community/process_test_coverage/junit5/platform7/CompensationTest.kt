package org.operaton.community.process_test_coverage.junit5.platform7

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.RegisterExtension
import org.operaton.bpm.engine.test.Deployment

class CompensationTest {

    companion object {
        @JvmField
        @RegisterExtension
        var extension: ProcessEngineCoverageExtension = ProcessEngineCoverageExtension.builder().assertClassCoverageAtLeast(1.0).build()
    }

    @Test
    @Deployment(resources = ["compensation.bpmn"])
    fun compensationWithoutPayloadRunsToTheEnd() {
        val instance = extension.processEngine.runtimeService.startProcessInstanceByKey("compensation")

        val finished = extension.processEngine.historyService.createHistoricProcessInstanceQuery()
            .processInstanceId(instance.id).finished().count()
        assertThat(finished).isEqualTo(1)
    }
}
