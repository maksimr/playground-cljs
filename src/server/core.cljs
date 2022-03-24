(ns server.core
  (:require ["os" :as os]))

(defn main []
  (let [user-name (.-username (.userInfo os))]
    (prn (.-version js/process))
    (prn (str "Hello " user-name))))