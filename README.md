This was a small tutorial for showing at Amsterdam.scala meetup. http://www.meetup.com/amsterdam-scala/events/231442786/

In particular, it links in libraries that are indispensable in being productive working with Scala.js. Intended to laying down a keel or as a starting point for further build. Already added is the [Haoyi's Workbench](https://github.com/lihaoyi/workbench) sbt plug-in. It spins up a local Spray web server on (by default) localhost:12345, whenever you're in the CLI console.
Navigate to [localhost:12345/target/scala-2.11/classes/index-dev.html](http://localhost:12345/target/scala-2.11/classes/index-dev.html) in the browser and it'll show a simple page tell you it's alive. You can access any file within your project directory by going to localhost:12345/path/to/file in a browser. The console of the browser will mirror the sbt's spamlog.

## Get started
To get started, run `sbt ~fastOptJS` in this example project. This should download dependencies and prepare the relevant javascript files. If you open [localhost:12345/target/scala-2.11/classes/index-dev.html](http://localhost:12345/target/scala-2.11/classes/index-dev.html) in your browser, it will show the demo. You can then edit the application and see the updates be sent live to the browser without needing to refresh the page.

## The optimized version
Run `sbt fullOptJS` and open up `index-opt.html` for an optimized (~200kb) version of the final application, useful for final publication. The auto-deployment function of the `sbt ~fastOptJS` is in that page not incorporated.

## Main method
Run `sbt run` to execute the main method with [http://phantomjs.org/](PhantomJS) installed. Or run `example.ScalaJSExample().main()` in the browser console.
