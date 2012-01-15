This repository is an easy entry point to start playing with Mario AI Championship 2011.

[Mario AI Championship 2011 Official Site](http://www.marioai.org/home)

[Mario Competition Google Group](http://groups.google.com/group/mariocompetition) is the best place for asking questions.


Getting Started
---------------

you can just download [distribution](https://github.com/downloads/zerg000000/mario-ai/mario-ai-0.0.1-SNAPSHOT-distribution.zip), include the jars in bin/ and lib/ to your project and start coding.
you can find demos in different languages in example/ directory.

If you are using maven, ivy or other build tools, add following repository

<http://zerg000000.github.com/mario-ai/repository/>

and declare the dependency, for maven
```
<dependency>
   <groupId>ch.idsia</groupId>
   <artifactId>mario-ai</artifactId>
   <version>0.0.1-SNAPSHOT</version>
</dependency>
```

you are ready to go!

Documentation
-------------

The documentation is little and outdated, you would take many time to sort out the real answer.
That's why this repository exist. But still, we need them to get started.
you can find them from [Mario AI Championship 2011 Official Site](http://www.marioai.org/home).
But here's a short list.

* [Game Play Track Getting Start](http://www.marioai.org/gameplay-track/getting-started)
* [Learning Track Getting Start](http://www.marioai.org/LearningTrack/getting-started)
* [Level Generation Getting Start](http://www.marioai.org/LevelGeneration/getting-started)

Hope you will enjoy it and join the Championship in the near future!

ps. any help in coding, example or documentation is welcome.

Build
-----

If your machine have Git and Maven installed.

To checkout project

    git clone git@github.com:zerg000000/mario-ai.git

Run following command at the project root and enjoy!

    mvn exec:java -Dexec.mainClass="ch.idsia.scenarios.Main" -Dexec.args="-ag ch.idsia.agents.controllers.ForwardJumpingAgent"

Release
-------

For release build, you must checkout out two project under same directory[1].

Checkout source code project

    git clone git@github.com:zerg000000/mario-ai.git mario-ai

Checkout repository project

    git clone git@github.com:zerg000000/mario-ai.git mario-ai-pages

Switch to gh-pages branch

    git checkout gh-pages

Do your release

    mvn -DperformRelease=true clean deploy

Update your mario-ai-pages project using [update-directory-index.sh](http://github.com/chkal/jsf-maven-util/blob/gh-pages/update-directory-index.sh)

Commit and Push

    git commit -am "your comment"
    git push origin master

[1]: http://chkal.blogspot.com/2010/09/maven-repositories-on-github.html
