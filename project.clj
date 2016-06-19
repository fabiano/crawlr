(defproject crawlr "0.1.0-SNAPSHOT"
  :aliases {
    "feed" ["run" "-m" "crawlr.cmdline.feed"]
    "migrate" ["run" "-m" "crawlr.cmdline.migrate"]
    "try" ["run" "-m" "crawlr.cmdline.try"]
    "worker" ["run" "-m" "crawlr.cmdline.worker"]
  }
  :dependencies [
    [com.taoensso/carmine "2.12.2"]
    [org.apache.logging.log4j/log4j-core "2.6"]
    [org.clojure/clojure "1.8.0"]
    [org.clojure/java.jdbc "0.6.0"]
    [org.clojure/tools.logging "0.3.1"]
    [org.jsoup/jsoup "1.8.3"]
    [org.postgresql/postgresql "9.4.1208"]
    [org.slf4j/slf4j-log4j12 "1.7.21"]
  ]
  :main ^:skip-aot crawlr.cmdline.try
  :profiles {
    :uberjar {:aot :all}
  }
  :target-path "target/%s")