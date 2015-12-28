(ns mycljsapp.core
  (:require [reagent.core :as reagent]))

(enable-console-print!) (figwheel.client/start {:on-jsload (fn [] (print "reloaded"))}) ; dev only

(defonce state (reagent/atom "Change me while figwheel is running and I will NOT change in the browser."))

(defn page [] [:div [:p @state] [:p "Change me while figwheel is running and I WILL change in the browser."]])

(reagent/render-component [page] (.getElementById js/document "app"))
