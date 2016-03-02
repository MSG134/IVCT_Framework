package de.fraunhofer.iosb.testrunner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.fraunhofer.iosb.tc_lib.AbstractTestCase;
import de.fraunhofer.iosb.tc_lib.IVCT_RTI_Factory;
import de.fraunhofer.iosb.tc_lib.IVCT_RTIambassador;
import de.fraunhofer.iosb.tc_lib.TcBaseModel;
import de.fraunhofer.iosb.tc_lib.TcParamTmr;


/**
 * Simple test enviroment. The TestRunner takes the classnames of the tests as
 * commandline arguments and then executes the tests in the given order.
 *
 * @author sen (Fraunhofer IOSB)
 */
public class TestRunner {

    private static Logger LOGGER = LoggerFactory.getLogger(TestRunner.class);


    /**
     * Command line entry point for the TestRunner.
     *
     * @param args command line parameters
     */
    public static void main(final String[] args) {
        new TestRunner().executeTests(args);

    }


    /**
     * execute the tests given as classnames.
     *
     * @param classnames The classnames of the tests to execute
     */
    public void executeTests(final String[] classnames) {
        for (final String classname: classnames) {
            AbstractTestCase testCase = null;
            try {
                testCase = (AbstractTestCase) Class.forName(classname).newInstance();
            }
            catch (InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
                LOGGER.error("Could not instantiate " + classname + " !", ex);
            }
            if (testCase == null) {
                continue;
            }
            // initialize LOGGER, localcache, federeateAmbassador and tcparam
        	String paramJson = "{\"federationName\",\"HelloWorld\"}";
            final Logger testLogger = LoggerFactory.getLogger(testCase.getClass());
            testCase.execute(paramJson, testLogger);
        }
    }
}
