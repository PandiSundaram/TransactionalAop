# TransactionalAop

project about how transactional annotation works in spring boot auto config @EnableTransactionManagement - spring configuration @Transactional behaves as proxy to create and close the connection behave of database connection class if we are not keeping this, jpa repository or sqltemplate will open the connection for you, where we need to handle teh transaction manually
Tranactional chain
1. Transactional(propogation = Propogation.Required) // default if we are not mention anything also wont create new trnx if already exisit with called method
2. Transactional(propogation = Propogation.RequireNew) // create new transaction even though if we have existing transaction
3. Transactional(propogation = Propogation.Mandatory) if we keep this in a method , the called method should have the trnx annotion else throws exception
4. Transactional(propogaton = Propogation.Support) if we keep this in a method. doesnot requires called method to keep the trnx annotation
5. Transactional(propogation = Propogation.NonSupported) keep the transaction and that particular block of code can execute with out transacton
6. Transactional(propogation = Propogation.Never)
AOP framework
AOP is used for cross cutting concerns like authentication logging will work independently out of your business logic
example use loggers
@EnableAspectJAutoProxy - make the aspect class as a proxy @Aspect - make that class as aspect class @PointCut - "within" "executes" - we will mention the places where we need to include our loggers or authenticaiton layers @Before ("pointcut"), @After, @Around - advices the logic. it has ProceedingJoinPoint processingpoint will have proceed method we can make use of that to check before and after execution
Logging framework
SLF4J interface

Implementation class
1.util logger
2. log4j
3. logback

Slf4j is a inteface it will abstract all kind of different implementation used in the various parts of the project

For example if we are using log4j and util logger in two different places, we can useon slf4j as a inteface to bind those

by default spring boot project provides slf4j implements lockback implementation

Logger log = LoggerFactory.getLogger(.class)

Levels - Trace -> Debug -> Info -> warning -> Error

if we include Trace, will provide all the sub class implementation end up having more logs, so commonly used log priority is .INFO

we can change that behaviour by mention below snippet in the .propetires file

logger.level.root = INFO/DEBUG/TRACE (not logger.level.{yourPackage} - used for specific package

for color appearence - spring.output.ansi.enabled = always

Generally logger has 3 main part, displaying log message, format the log message (edit the timestamp displayed), sending the log message to mail or
create a file where we can save the logs as well

