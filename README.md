# diffbot-java
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/im.nll.data/diffbot-java/badge.svg)](https://maven-badges.herokuapp.com/maven-central/im.nll.data/diffbot-java/)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg)](https://www.apache.org/licenses/LICENSE-2.0.html)

  diffbot api service for java. diffbot api doc https://www.diffbot.com/dev/docs/
  
#Usage
To add a dependency on diffbot-java using Maven, use the following:

```xml
<dependency>
    <groupId>im.nll.data</groupId>
    <artifactId>diffbot-java</artifactId>
    <version>0.9.1</version>
</dependency>
```

To add a dependency using Gradle:

```
dependencies {
  compile 'im.nll.data:diffbot-java:0.9.1'
}
```


#Examples

###article api

````java
    @Test
    public void article() throws Exception {
        String url = "http://www.bloomberg.com/news/articles/2016-03-07/alibaba-finance-affiliate-buy-h-k-firm-for-china-lotteries";
        Article article = DiffbotClient.newClient(token).article(url);
        System.out.println(article.getType());
        System.out.println(article.getTitle());
        System.out.println(article.getEstimatedDate());
        System.out.println(article.getSiteName());
        System.out.println(article.getText());
        System.out.println(article.getPageUrl());
        System.out.println(article.getHtml());
        System.out.println(article.getDate());
        System.out.println(article.getAuthor());
        System.out.println(article.getAuthorUrl());
        //and etc...
    }
````

see [Example](https://github.com/fivesmallq/diffbot-java/blob/master/src/test/java/im/nll/data/diffbot/DiffbotClientTest.java)

#Contributing

Bug reports and pull requests are welcome on GitHub at https://github.com/fivesmallq/diffbot-java.
