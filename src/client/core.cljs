(ns client.core)

(defn -main [] (set!
                (.-innerText
                 (js/document.getElementById "app"))
                "Hello World!"))

(-main)