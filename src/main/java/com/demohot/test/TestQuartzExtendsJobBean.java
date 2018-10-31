package com.demohot.test;

import org.joda.time.DateTime;
import org.junit.platform.commons.logging.LoggerFactory;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class TestQuartzExtendsJobBean extends QuartzJobBean {
	private static Logger logger = (Logger) LoggerFactory.getLogger(TestQuartzExtendsJobBean.class);

	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		logger.info("Auto Execute TestMethod start! Date={}", new DateTime().toString("YYYY-MM-DD HH:mm:ss"));
		logger.info("**********" + context.getMergedJobDataMap().get("descString") + "************");
		logger.info("Auto Execute TestMethod end! Date={}", new DateTime().toString("YYYY-MM-DD HH:mm:ss"));
	}

}
