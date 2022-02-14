(ns script.build
  (:require
   [clojure.string :refer [trim]]
   [clojure.java.shell :as shell]))

(defn setup
  "Gitpod generate URL for open port so we should
   use this URL to properly forward connection from browser to the server"
  {:shadow.build/stage :configure}
  [build-state]
  (if (not-empty (System/getenv "GITPOD_WORKSPACE_URL"))
    (assoc-in build-state
              [:compiler-options :closure-defines 'shadow.cljs.devtools.client.env/devtools-url]
              (trim (:out (shell/sh "gp" "url" "9630"))))
    build-state))