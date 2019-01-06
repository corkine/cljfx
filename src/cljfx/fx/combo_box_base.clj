(ns cljfx.fx.combo-box-base
  (:require [cljfx.lifecycle.composite :as lifecycle.composite]
            [cljfx.lifecycle :as lifecycle]
            [cljfx.coerce :as coerce]
            [cljfx.fx.control :as fx.control])
  (:import [javafx.scene.control ComboBoxBase]))

(def lifecycle
  (lifecycle.composite/describe ComboBoxBase
    :extends [fx.control/lifecycle]
    :props {:editable [:setter lifecycle/scalar :default false]
            :on-action [:setter lifecycle/event-handler :coerce coerce/event-handler]
            :on-hidden [:setter lifecycle/event-handler :coerce coerce/event-handler]
            :on-hiding [:setter lifecycle/event-handler :coerce coerce/event-handler]
            :on-showing [:setter lifecycle/event-handler :coerce coerce/event-handler]
            :on-shown [:setter lifecycle/event-handler :coerce coerce/event-handler]
            :prompt-text [:setter lifecycle/scalar]
            :value [:setter lifecycle/scalar]}))