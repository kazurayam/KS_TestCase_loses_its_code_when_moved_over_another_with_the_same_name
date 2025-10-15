import com.kms.katalon.core.util.KeywordUtil

def v = new Date().getTime()
if (v % 2 != 0) {
	KeywordUtil.markFailed("${v} is not even")
} else {
	KeywordUtil.logInfo("${v} is even")
}

Random rand = new Random()
Thread.sleep(rand.nextInt(999))
