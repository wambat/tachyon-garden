(ns tachyon-garden.styles.negative-margin
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]
   [tachyon-garden.styles.media-queries :refer [with-media]]))

(def spacing
  {:spacing-none                    0
   :spacing-extra-small             "-.25rem"
   :spacing-small                   "-.5rem"
   :spacing-medium                  "-1rem"
   :spacing-large                   "-2rem"
   :spacing-extra-large             "-4rem"
   :spacing-extra-extra-large       "-8rem"
   :spacing-extra-extra-extra-large "-16rem"})

(def styledefs
  :pa0 {:padding (:spacing-none                    spacing)}
  :pa1 {:padding (:spacing-extra-small             spacing)}
  :pa2 {:padding (:spacing-small                   spacing)}
  :pa3 {:padding (:spacing-medium                  spacing)}
  :pa4 {:padding (:spacing-large                   spacing)}
  :pa5 {:padding (:spacing-extra-large             spacing)}
  :pa6 {:padding (:spacing-extra-extra-large       spacing)}
  :pa7 {:padding (:spacing-extra-extra-extra-large spacing)}
  :pl0 {:padding-left (:spacing-none                    spacing)}
  :pl1 {:padding-left (:spacing-extra-small             spacing)}
  :pl2 {:padding-left (:spacing-small                   spacing)}
  :pl3 {:padding-left (:spacing-medium                  spacing)}
  :pl4 {:padding-left (:spacing-large                   spacing)}
  :pl5 {:padding-left (:spacing-extra-large             spacing)}
  :pl6 {:padding-left (:spacing-extra-extra-large       spacing)}
  :pl7 {:padding-left (:spacing-extra-extra-extra-large spacing)}
  :pr0 {:padding-right (:spacing-none                    spacing)}
  :pr1 {:padding-right (:spacing-extra-small             spacing)}
  :pr2 {:padding-right (:spacing-small                   spacing)}
  :pr3 {:padding-right (:spacing-medium                  spacing)}
  :pr4 {:padding-right (:spacing-large                   spacing)}
  :pr5 {:padding-right (:spacing-extra-large             spacing)}
  :pr6 {:padding-right (:spacing-extra-extra-large       spacing)}
  :pr7 {:padding-right (:spacing-extra-extra-extra-large spacing)}
  :pb0 {:padding-bottom (:spacing-none                    spacing)}
  :pb1 {:padding-bottom (:spacing-extra-small             spacing)}
  :pb2 {:padding-bottom (:spacing-small                   spacing)}
  :pb3 {:padding-bottom (:spacing-medium                  spacing)}
  :pb4 {:padding-bottom (:spacing-large                   spacing)}
  :pb5 {:padding-bottom (:spacing-extra-large             spacing)}
  :pb6 {:padding-bottom (:spacing-extra-extra-large       spacing)}
  :pb7 {:padding-bottom (:spacing-extra-extra-extra-large spacing)}
  :pt0 {:padding-top (:spacing-none                    spacing)}
  :pt1 {:padding-top (:spacing-extra-small             spacing)}
  :pt2 {:padding-top (:spacing-small                   spacing)}
  :pt3 {:padding-top (:spacing-medium                  spacing)}
  :pt4 {:padding-top (:spacing-large                   spacing)}
  :pt5 {:padding-top (:spacing-extra-large             spacing)}
  :pt6 {:padding-top (:spacing-extra-extra-large       spacing)}
  :pt7 {:padding-top (:spacing-extra-extra-extra-large spacing)}
  :pv0 {:padding-top (:spacing-none                    spacing) :padding-bottom (:spacing-none                    spacing)}
  :pv1 {:padding-top (:spacing-extra-small             spacing) :padding-bottom (:spacing-extra-small             spacing)}
  :pv2 {:padding-top (:spacing-small                   spacing) :padding-bottom (:spacing-small                   spacing)}
  :pv3 {:padding-top (:spacing-medium                  spacing) :padding-bottom (:spacing-medium                  spacing)}
  :pv4 {:padding-top (:spacing-large                   spacing) :padding-bottom (:spacing-large                   spacing)}
  :pv5 {:padding-top (:spacing-extra-large             spacing) :padding-bottom (:spacing-extra-large             spacing)}
  :pv6 {:padding-top (:spacing-extra-extra-large       spacing) :padding-bottom (:spacing-extra-extra-large       spacing)}
  :pv7 {:padding-top (:spacing-extra-extra-extra-large spacing) :padding-bottom (:spacing-extra-extra-extra-large spacing)}
  :ph0 {:padding-left (:spacing-none                    spacing) :padding-right (:spacing-none                    spacing)}
  :ph1 {:padding-left (:spacing-extra-small             spacing) :padding-right (:spacing-extra-small             spacing)}
  :ph2 {:padding-left (:spacing-small                   spacing) :padding-right (:spacing-small                   spacing)}
  :ph3 {:padding-left (:spacing-medium                  spacing) :padding-right (:spacing-medium                  spacing)}
  :ph4 {:padding-left (:spacing-large                   spacing) :padding-right (:spacing-large                   spacing)}
  :ph5 {:padding-left (:spacing-extra-large             spacing) :padding-right (:spacing-extra-large             spacing)}
  :ph6 {:padding-left (:spacing-extra-extra-large       spacing) :padding-right (:spacing-extra-extra-large       spacing)}
  :ph7 {:padding-left (:spacing-extra-extra-extra-large spacing) :padding-right (:spacing-extra-extra-extra-large spacing)}
  :ma0 {:margin (:spacing-none                    spacing)}
  :ma1 {:margin (:spacing-extra-small             spacing)}
  :ma2 {:margin (:spacing-small                   spacing)}
  :ma3 {:margin (:spacing-medium                  spacing)}
  :ma4 {:margin (:spacing-large                   spacing)}
  :ma5 {:margin (:spacing-extra-large             spacing)}
  :ma6 {:margin (:spacing-extra-extra-large       spacing)}
  :ma7 {:margin (:spacing-extra-extra-extra-large spacing)}
  :ml0 {:margin-left (:spacing-none                    spacing)}
  :ml1 {:margin-left (:spacing-extra-small             spacing)}
  :ml2 {:margin-left (:spacing-small                   spacing)}
  :ml3 {:margin-left (:spacing-medium                  spacing)}
  :ml4 {:margin-left (:spacing-large                   spacing)}
  :ml5 {:margin-left (:spacing-extra-large             spacing)}
  :ml6 {:margin-left (:spacing-extra-extra-large       spacing)}
  :ml7 {:margin-left (:spacing-extra-extra-extra-large spacing)}
  :mr0 {:margin-right (:spacing-none                    spacing)}
  :mr1 {:margin-right (:spacing-extra-small             spacing)}
  :mr2 {:margin-right (:spacing-small                   spacing)}
  :mr3 {:margin-right (:spacing-medium                  spacing)}
  :mr4 {:margin-right (:spacing-large                   spacing)}
  :mr5 {:margin-right (:spacing-extra-large             spacing)}
  :mr6 {:margin-right (:spacing-extra-extra-large       spacing)}
  :mr7 {:margin-right (:spacing-extra-extra-extra-large spacing)}
  :mb0 {:margin-bottom (:spacing-none                    spacing)}
  :mb1 {:margin-bottom (:spacing-extra-small             spacing)}
  :mb2 {:margin-bottom (:spacing-small                   spacing)}
  :mb3 {:margin-bottom (:spacing-medium                  spacing)}
  :mb4 {:margin-bottom (:spacing-large                   spacing)}
  :mb5 {:margin-bottom (:spacing-extra-large             spacing)}
  :mb6 {:margin-bottom (:spacing-extra-extra-large       spacing)}
  :mb7 {:margin-bottom (:spacing-extra-extra-extra-large spacing)}
  :mt0 {:margin-top (:spacing-none                    spacing)}
  :mt1 {:margin-top (:spacing-extra-small             spacing)}
  :mt2 {:margin-top (:spacing-small                   spacing)}
  :mt3 {:margin-top (:spacing-medium                  spacing)}
  :mt4 {:margin-top (:spacing-large                   spacing)}
  :mt5 {:margin-top (:spacing-extra-large             spacing)}
  :mt6 {:margin-top (:spacing-extra-extra-large       spacing)}
  :mt7 {:margin-top (:spacing-extra-extra-extra-large spacing)}
  :mv0 {:margin-top (:spacing-none                    spacing) :margin-bottom (:spacing-none                    spacing)}
  :mv1 {:margin-top (:spacing-extra-small             spacing) :margin-bottom (:spacing-extra-small             spacing)}
  :mv2 {:margin-top (:spacing-small                   spacing) :margin-bottom (:spacing-small                   spacing)}
  :mv3 {:margin-top (:spacing-medium                  spacing) :margin-bottom (:spacing-medium                  spacing)}
  :mv4 {:margin-top (:spacing-large                   spacing) :margin-bottom (:spacing-large                   spacing)}
  :mv5 {:margin-top (:spacing-extra-large             spacing) :margin-bottom (:spacing-extra-large             spacing)}
  :mv6 {:margin-top (:spacing-extra-extra-large       spacing) :margin-bottom (:spacing-extra-extra-large       spacing)}
  :mv7 {:margin-top (:spacing-extra-extra-extra-large spacing) :margin-bottom (:spacing-extra-extra-extra-large spacing)}
  :mh0 {:margin-left (:spacing-none                    spacing) :margin-right (:spacing-none                    spacing)}
  :mh1 {:margin-left (:spacing-extra-small             spacing) :margin-right (:spacing-extra-small             spacing)}
  :mh2 {:margin-left (:spacing-small                   spacing) :margin-right (:spacing-small                   spacing)}
  :mh3 {:margin-left (:spacing-medium                  spacing) :margin-right (:spacing-medium                  spacing)}
  :mh4 {:margin-left (:spacing-large                   spacing) :margin-right (:spacing-large                   spacing)}
  :mh5 {:margin-left (:spacing-extra-large             spacing) :margin-right (:spacing-extra-large             spacing)}
  :mh6 {:margin-left (:spacing-extra-extra-large       spacing) :margin-right (:spacing-extra-extra-large       spacing)}
  :mh7 {:margin-left (:spacing-extra-extra-extra-large spacing) :margin-right (:spacing-extra-extra-extra-large spacing)}    
  :pa0-ns {:padding (:spacing-none                    spacing)}
  :pa1-ns {:padding (:spacing-extra-small             spacing)}
  :pa2-ns {:padding (:spacing-small                   spacing)}
  :pa3-ns {:padding (:spacing-medium                  spacing)}
  :pa4-ns {:padding (:spacing-large                   spacing)}
  :pa5-ns {:padding (:spacing-extra-large             spacing)}
  :pa6-ns {:padding (:spacing-extra-extra-large       spacing)}
  :pa7-ns {:padding (:spacing-extra-extra-extra-large spacing)}
  :pl0-ns {:padding-left (:spacing-none                    spacing)}
  :pl1-ns {:padding-left (:spacing-extra-small             spacing)}
  :pl2-ns {:padding-left (:spacing-small                   spacing)}
  :pl3-ns {:padding-left (:spacing-medium                  spacing)}
  :pl4-ns {:padding-left (:spacing-large                   spacing)}
  :pl5-ns {:padding-left (:spacing-extra-large             spacing)}
  :pl6-ns {:padding-left (:spacing-extra-extra-large       spacing)}
  :pl7-ns {:padding-left (:spacing-extra-extra-extra-large spacing)}
  :pr0-ns {:padding-right (:spacing-none                    spacing)}
  :pr1-ns {:padding-right (:spacing-extra-small             spacing)}
  :pr2-ns {:padding-right (:spacing-small                   spacing)}
  :pr3-ns {:padding-right (:spacing-medium                  spacing)}
  :pr4-ns {:padding-right (:spacing-large                   spacing)}
  :pr5-ns {:padding-right (:spacing-extra-large             spacing)}
  :pr6-ns {:padding-right (:spacing-extra-extra-large       spacing)}
  :pr7-ns {:padding-right (:spacing-extra-extra-extra-large spacing)}
  :pb0-ns {:padding-bottom (:spacing-none                    spacing)}
  :pb1-ns {:padding-bottom (:spacing-extra-small             spacing)}
  :pb2-ns {:padding-bottom (:spacing-small                   spacing)}
  :pb3-ns {:padding-bottom (:spacing-medium                  spacing)}
  :pb4-ns {:padding-bottom (:spacing-large                   spacing)}
  :pb5-ns {:padding-bottom (:spacing-extra-large             spacing)}
  :pb6-ns {:padding-bottom (:spacing-extra-extra-large       spacing)}
  :pb7-ns {:padding-bottom (:spacing-extra-extra-extra-large spacing)}
  :pt0-ns {:padding-top (:spacing-none                    spacing)}
  :pt1-ns {:padding-top (:spacing-extra-small             spacing)}
  :pt2-ns {:padding-top (:spacing-small                   spacing)}
  :pt3-ns {:padding-top (:spacing-medium                  spacing)}
  :pt4-ns {:padding-top (:spacing-large                   spacing)}
  :pt5-ns {:padding-top (:spacing-extra-large             spacing)}
  :pt6-ns {:padding-top (:spacing-extra-extra-large       spacing)}
  :pt7-ns {:padding-top (:spacing-extra-extra-extra-large spacing)}
  :pv0-ns {:padding-top (:spacing-none                    spacing) :padding-bottom (:spacing-none                    spacing)}
  :pv1-ns {:padding-top (:spacing-extra-small             spacing) :padding-bottom (:spacing-extra-small             spacing)}
  :pv2-ns {:padding-top (:spacing-small                   spacing) :padding-bottom (:spacing-small                   spacing)}
  :pv3-ns {:padding-top (:spacing-medium                  spacing) :padding-bottom (:spacing-medium                  spacing)}
  :pv4-ns {:padding-top (:spacing-large                   spacing) :padding-bottom (:spacing-large                   spacing)}
  :pv5-ns {:padding-top (:spacing-extra-large             spacing) :padding-bottom (:spacing-extra-large             spacing)}
  :pv6-ns {:padding-top (:spacing-extra-extra-large       spacing) :padding-bottom (:spacing-extra-extra-large       spacing)}
  :pv7-ns {:padding-top (:spacing-extra-extra-extra-large spacing) :padding-bottom (:spacing-extra-extra-extra-large spacing)}
  :ph0-ns {:padding-left (:spacing-none                    spacing) :padding-right (:spacing-none                    spacing)}
  :ph1-ns {:padding-left (:spacing-extra-small             spacing) :padding-right (:spacing-extra-small             spacing)}
  :ph2-ns {:padding-left (:spacing-small                   spacing) :padding-right (:spacing-small                   spacing)}
  :ph3-ns {:padding-left (:spacing-medium                  spacing) :padding-right (:spacing-medium                  spacing)}
  :ph4-ns {:padding-left (:spacing-large                   spacing) :padding-right (:spacing-large                   spacing)}
  :ph5-ns {:padding-left (:spacing-extra-large             spacing) :padding-right (:spacing-extra-large             spacing)}
  :ph6-ns {:padding-left (:spacing-extra-extra-large       spacing) :padding-right (:spacing-extra-extra-large       spacing)}
  :ph7-ns {:padding-left (:spacing-extra-extra-extra-large spacing) :padding-right (:spacing-extra-extra-extra-large spacing)}
  :ma0-ns {:margin (:spacing-none                    spacing)}
  :ma1-ns {:margin (:spacing-extra-small             spacing)}
  :ma2-ns {:margin (:spacing-small                   spacing)}
  :ma3-ns {:margin (:spacing-medium                  spacing)}
  :ma4-ns {:margin (:spacing-large                   spacing)}
  :ma5-ns {:margin (:spacing-extra-large             spacing)}
  :ma6-ns {:margin (:spacing-extra-extra-large       spacing)}
  :ma7-ns {:margin (:spacing-extra-extra-extra-large spacing)}
  :ml0-ns {:margin-left (:spacing-none                    spacing)}
  :ml1-ns {:margin-left (:spacing-extra-small             spacing)}
  :ml2-ns {:margin-left (:spacing-small                   spacing)}
  :ml3-ns {:margin-left (:spacing-medium                  spacing)}
  :ml4-ns {:margin-left (:spacing-large                   spacing)}
  :ml5-ns {:margin-left (:spacing-extra-large             spacing)}
  :ml6-ns {:margin-left (:spacing-extra-extra-large       spacing)}
  :ml7-ns {:margin-left (:spacing-extra-extra-extra-large spacing)}
  :mr0-ns {:margin-right (:spacing-none                    spacing)}
  :mr1-ns {:margin-right (:spacing-extra-small             spacing)}
  :mr2-ns {:margin-right (:spacing-small                   spacing)}
  :mr3-ns {:margin-right (:spacing-medium                  spacing)}
  :mr4-ns {:margin-right (:spacing-large                   spacing)}
  :mr5-ns {:margin-right (:spacing-extra-large             spacing)}
  :mr6-ns {:margin-right (:spacing-extra-extra-large       spacing)}
  :mr7-ns {:margin-right (:spacing-extra-extra-extra-large spacing)}
  :mb0-ns {:margin-bottom (:spacing-none                    spacing)}
  :mb1-ns {:margin-bottom (:spacing-extra-small             spacing)}
  :mb2-ns {:margin-bottom (:spacing-small                   spacing)}
  :mb3-ns {:margin-bottom (:spacing-medium                  spacing)}
  :mb4-ns {:margin-bottom (:spacing-large                   spacing)}
  :mb5-ns {:margin-bottom (:spacing-extra-large             spacing)}
  :mb6-ns {:margin-bottom (:spacing-extra-extra-large       spacing)}
  :mb7-ns {:margin-bottom (:spacing-extra-extra-extra-large spacing)}
  :mt0-ns {:margin-top (:spacing-none                    spacing)}
  :mt1-ns {:margin-top (:spacing-extra-small             spacing)}
  :mt2-ns {:margin-top (:spacing-small                   spacing)}
  :mt3-ns {:margin-top (:spacing-medium                  spacing)}
  :mt4-ns {:margin-top (:spacing-large                   spacing)}
  :mt5-ns {:margin-top (:spacing-extra-large             spacing)}
  :mt6-ns {:margin-top (:spacing-extra-extra-large       spacing)}
  :mt7-ns {:margin-top (:spacing-extra-extra-extra-large spacing)}
  :mv0-ns {:margin-top (:spacing-none                    spacing) :margin-bottom (:spacing-none                    spacing)}
  :mv1-ns {:margin-top (:spacing-extra-small             spacing) :margin-bottom (:spacing-extra-small             spacing)}
  :mv2-ns {:margin-top (:spacing-small                   spacing) :margin-bottom (:spacing-small                   spacing)}
  :mv3-ns {:margin-top (:spacing-medium                  spacing) :margin-bottom (:spacing-medium                  spacing)}
  :mv4-ns {:margin-top (:spacing-large                   spacing) :margin-bottom (:spacing-large                   spacing)}
  :mv5-ns {:margin-top (:spacing-extra-large             spacing) :margin-bottom (:spacing-extra-large             spacing)}
  :mv6-ns {:margin-top (:spacing-extra-extra-large       spacing) :margin-bottom (:spacing-extra-extra-large       spacing)}
  :mv7-ns {:margin-top (:spacing-extra-extra-extra-large spacing) :margin-bottom (:spacing-extra-extra-extra-large spacing)}
  :mh0-ns {:margin-left (:spacing-none                    spacing) :margin-right (:spacing-none                    spacing)}
  :mh1-ns {:margin-left (:spacing-extra-small             spacing) :margin-right (:spacing-extra-small             spacing)}
  :mh2-ns {:margin-left (:spacing-small                   spacing) :margin-right (:spacing-small                   spacing)}
  :mh3-ns {:margin-left (:spacing-medium                  spacing) :margin-right (:spacing-medium                  spacing)}
  :mh4-ns {:margin-left (:spacing-large                   spacing) :margin-right (:spacing-large                   spacing)}
  :mh5-ns {:margin-left (:spacing-extra-large             spacing) :margin-right (:spacing-extra-large             spacing)}
  :mh6-ns {:margin-left (:spacing-extra-extra-large       spacing) :margin-right (:spacing-extra-extra-large       spacing)}
  :mh7-ns {:margin-left (:spacing-extra-extra-extra-large spacing) :margin-right (:spacing-extra-extra-extra-large spacing)}
  :pa0-m {:padding (:spacing-none                    spacing)}
  :pa1-m {:padding (:spacing-extra-small             spacing)}
  :pa2-m {:padding (:spacing-small                   spacing)}
  :pa3-m {:padding (:spacing-medium                  spacing)}
  :pa4-m {:padding (:spacing-large                   spacing)}
  :pa5-m {:padding (:spacing-extra-large             spacing)}
  :pa6-m {:padding (:spacing-extra-extra-large       spacing)}
  :pa7-m {:padding (:spacing-extra-extra-extra-large spacing)}
  :pl0-m {:padding-left (:spacing-none                    spacing)}
  :pl1-m {:padding-left (:spacing-extra-small             spacing)}
  :pl2-m {:padding-left (:spacing-small                   spacing)}
  :pl3-m {:padding-left (:spacing-medium                  spacing)}
  :pl4-m {:padding-left (:spacing-large                   spacing)}
  :pl5-m {:padding-left (:spacing-extra-large             spacing)}
  :pl6-m {:padding-left (:spacing-extra-extra-large       spacing)}
  :pl7-m {:padding-left (:spacing-extra-extra-extra-large spacing)}
  :pr0-m {:padding-right (:spacing-none                    spacing)}
  :pr1-m {:padding-right (:spacing-extra-small             spacing)}
  :pr2-m {:padding-right (:spacing-small                   spacing)}
  :pr3-m {:padding-right (:spacing-medium                  spacing)}
  :pr4-m {:padding-right (:spacing-large                   spacing)}
  :pr5-m {:padding-right (:spacing-extra-large             spacing)}
  :pr6-m {:padding-right (:spacing-extra-extra-large       spacing)}
  :pr7-m {:padding-right (:spacing-extra-extra-extra-large spacing)}
  :pb0-m {:padding-bottom (:spacing-none                    spacing)}
  :pb1-m {:padding-bottom (:spacing-extra-small             spacing)}
  :pb2-m {:padding-bottom (:spacing-small                   spacing)}
  :pb3-m {:padding-bottom (:spacing-medium                  spacing)}
  :pb4-m {:padding-bottom (:spacing-large                   spacing)}
  :pb5-m {:padding-bottom (:spacing-extra-large             spacing)}
  :pb6-m {:padding-bottom (:spacing-extra-extra-large       spacing)}
  :pb7-m {:padding-bottom (:spacing-extra-extra-extra-large spacing)}
  :pt0-m {:padding-top (:spacing-none                    spacing)}
  :pt1-m {:padding-top (:spacing-extra-small             spacing)}
  :pt2-m {:padding-top (:spacing-small                   spacing)}
  :pt3-m {:padding-top (:spacing-medium                  spacing)}
  :pt4-m {:padding-top (:spacing-large                   spacing)}
  :pt5-m {:padding-top (:spacing-extra-large             spacing)}
  :pt6-m {:padding-top (:spacing-extra-extra-large       spacing)}
  :pt7-m {:padding-top (:spacing-extra-extra-extra-large spacing)}
  :pv0-m {:padding-top (:spacing-none                    spacing) :padding-bottom (:spacing-none                    spacing)}
  :pv1-m {:padding-top (:spacing-extra-small             spacing) :padding-bottom (:spacing-extra-small             spacing)}
  :pv2-m {:padding-top (:spacing-small                   spacing) :padding-bottom (:spacing-small                   spacing)}
  :pv3-m {:padding-top (:spacing-medium                  spacing) :padding-bottom (:spacing-medium                  spacing)}
  :pv4-m {:padding-top (:spacing-large                   spacing) :padding-bottom (:spacing-large                   spacing)}
  :pv5-m {:padding-top (:spacing-extra-large             spacing) :padding-bottom (:spacing-extra-large             spacing)}
  :pv6-m {:padding-top (:spacing-extra-extra-large       spacing) :padding-bottom (:spacing-extra-extra-large       spacing)}
  :pv7-m {:padding-top (:spacing-extra-extra-extra-large spacing) :padding-bottom (:spacing-extra-extra-extra-large spacing)}
  :ph0-m {:padding-left (:spacing-none                    spacing) :padding-right (:spacing-none                    spacing)}
  :ph1-m {:padding-left (:spacing-extra-small             spacing) :padding-right (:spacing-extra-small             spacing)}
  :ph2-m {:padding-left (:spacing-small                   spacing) :padding-right (:spacing-small                   spacing)}
  :ph3-m {:padding-left (:spacing-medium                  spacing) :padding-right (:spacing-medium                  spacing)}
  :ph4-m {:padding-left (:spacing-large                   spacing) :padding-right (:spacing-large                   spacing)}
  :ph5-m {:padding-left (:spacing-extra-large             spacing) :padding-right (:spacing-extra-large             spacing)}
  :ph6-m {:padding-left (:spacing-extra-extra-large       spacing) :padding-right (:spacing-extra-extra-large       spacing)}
  :ph7-m {:padding-left (:spacing-extra-extra-extra-large spacing) :padding-right (:spacing-extra-extra-extra-large spacing)}
  :ma0-m {:margin (:spacing-none                    spacing)}
  :ma1-m {:margin (:spacing-extra-small             spacing)}
  :ma2-m {:margin (:spacing-small                   spacing)}
  :ma3-m {:margin (:spacing-medium                  spacing)}
  :ma4-m {:margin (:spacing-large                   spacing)}
  :ma5-m {:margin (:spacing-extra-large             spacing)}
  :ma6-m {:margin (:spacing-extra-extra-large       spacing)}
  :ma7-m {:margin (:spacing-extra-extra-extra-large spacing)}
  :ml0-m {:margin-left (:spacing-none                    spacing)}
  :ml1-m {:margin-left (:spacing-extra-small             spacing)}
  :ml2-m {:margin-left (:spacing-small                   spacing)}
  :ml3-m {:margin-left (:spacing-medium                  spacing)}
  :ml4-m {:margin-left (:spacing-large                   spacing)}
  :ml5-m {:margin-left (:spacing-extra-large             spacing)}
  :ml6-m {:margin-left (:spacing-extra-extra-large       spacing)}
  :ml7-m {:margin-left (:spacing-extra-extra-extra-large spacing)}
  :mr0-m {:margin-right (:spacing-none                    spacing)}
  :mr1-m {:margin-right (:spacing-extra-small             spacing)}
  :mr2-m {:margin-right (:spacing-small                   spacing)}
  :mr3-m {:margin-right (:spacing-medium                  spacing)}
  :mr4-m {:margin-right (:spacing-large                   spacing)}
  :mr5-m {:margin-right (:spacing-extra-large             spacing)}
  :mr6-m {:margin-right (:spacing-extra-extra-large       spacing)}
  :mr7-m {:margin-right (:spacing-extra-extra-extra-large spacing)}
  :mb0-m {:margin-bottom (:spacing-none                    spacing)}
  :mb1-m {:margin-bottom (:spacing-extra-small             spacing)}
  :mb2-m {:margin-bottom (:spacing-small                   spacing)}
  :mb3-m {:margin-bottom (:spacing-medium                  spacing)}
  :mb4-m {:margin-bottom (:spacing-large                   spacing)}
  :mb5-m {:margin-bottom (:spacing-extra-large             spacing)}
  :mb6-m {:margin-bottom (:spacing-extra-extra-large       spacing)}
  :mb7-m {:margin-bottom (:spacing-extra-extra-extra-large spacing)}
  :mt0-m {:margin-top (:spacing-none                    spacing)}
  :mt1-m {:margin-top (:spacing-extra-small             spacing)}
  :mt2-m {:margin-top (:spacing-small                   spacing)}
  :mt3-m {:margin-top (:spacing-medium                  spacing)}
  :mt4-m {:margin-top (:spacing-large                   spacing)}
  :mt5-m {:margin-top (:spacing-extra-large             spacing)}
  :mt6-m {:margin-top (:spacing-extra-extra-large       spacing)}
  :mt7-m {:margin-top (:spacing-extra-extra-extra-large spacing)}
  :mv0-m {:margin-top (:spacing-none                    spacing) :margin-bottom (:spacing-none                    spacing)}
  :mv1-m {:margin-top (:spacing-extra-small             spacing) :margin-bottom (:spacing-extra-small             spacing)}
  :mv2-m {:margin-top (:spacing-small                   spacing) :margin-bottom (:spacing-small                   spacing)}
  :mv3-m {:margin-top (:spacing-medium                  spacing) :margin-bottom (:spacing-medium                  spacing)}
  :mv4-m {:margin-top (:spacing-large                   spacing) :margin-bottom (:spacing-large                   spacing)}
  :mv5-m {:margin-top (:spacing-extra-large             spacing) :margin-bottom (:spacing-extra-large             spacing)}
  :mv6-m {:margin-top (:spacing-extra-extra-large       spacing) :margin-bottom (:spacing-extra-extra-large       spacing)}
  :mv7-m {:margin-top (:spacing-extra-extra-extra-large spacing) :margin-bottom (:spacing-extra-extra-extra-large spacing)}
  :mh0-m {:margin-left (:spacing-none                    spacing) :margin-right (:spacing-none                    spacing)}
  :mh1-m {:margin-left (:spacing-extra-small             spacing) :margin-right (:spacing-extra-small             spacing)}
  :mh2-m {:margin-left (:spacing-small                   spacing) :margin-right (:spacing-small                   spacing)}
  :mh3-m {:margin-left (:spacing-medium                  spacing) :margin-right (:spacing-medium                  spacing)}
  :mh4-m {:margin-left (:spacing-large                   spacing) :margin-right (:spacing-large                   spacing)}
  :mh5-m {:margin-left (:spacing-extra-large             spacing) :margin-right (:spacing-extra-large             spacing)}
  :mh6-m {:margin-left (:spacing-extra-extra-large       spacing) :margin-right (:spacing-extra-extra-large       spacing)}
  :mh7-m {:margin-left (:spacing-extra-extra-extra-large spacing) :margin-right (:spacing-extra-extra-extra-large spacing)}
  :pa0-l {:padding (:spacing-none                    spacing)}
  :pa1-l {:padding (:spacing-extra-small             spacing)}
  :pa2-l {:padding (:spacing-small                   spacing)}
  :pa3-l {:padding (:spacing-medium                  spacing)}
  :pa4-l {:padding (:spacing-large                   spacing)}
  :pa5-l {:padding (:spacing-extra-large             spacing)}
  :pa6-l {:padding (:spacing-extra-extra-large       spacing)}
  :pa7-l {:padding (:spacing-extra-extra-extra-large spacing)}
  :pl0-l {:padding-left (:spacing-none                    spacing)}
  :pl1-l {:padding-left (:spacing-extra-small             spacing)}
  :pl2-l {:padding-left (:spacing-small                   spacing)}
  :pl3-l {:padding-left (:spacing-medium                  spacing)}
  :pl4-l {:padding-left (:spacing-large                   spacing)}
  :pl5-l {:padding-left (:spacing-extra-large             spacing)}
  :pl6-l {:padding-left (:spacing-extra-extra-large       spacing)}
  :pl7-l {:padding-left (:spacing-extra-extra-extra-large spacing)}
  :pr0-l {:padding-right (:spacing-none                    spacing)}
  :pr1-l {:padding-right (:spacing-extra-small             spacing)}
  :pr2-l {:padding-right (:spacing-small                   spacing)}
  :pr3-l {:padding-right (:spacing-medium                  spacing)}
  :pr4-l {:padding-right (:spacing-large                   spacing)}
  :pr5-l {:padding-right (:spacing-extra-large             spacing)}
  :pr6-l {:padding-right (:spacing-extra-extra-large       spacing)}
  :pr7-l {:padding-right (:spacing-extra-extra-extra-large spacing)}
  :pb0-l {:padding-bottom (:spacing-none                    spacing)}
  :pb1-l {:padding-bottom (:spacing-extra-small             spacing)}
  :pb2-l {:padding-bottom (:spacing-small                   spacing)}
  :pb3-l {:padding-bottom (:spacing-medium                  spacing)}
  :pb4-l {:padding-bottom (:spacing-large                   spacing)}
  :pb5-l {:padding-bottom (:spacing-extra-large             spacing)}
  :pb6-l {:padding-bottom (:spacing-extra-extra-large       spacing)}
  :pb7-l {:padding-bottom (:spacing-extra-extra-extra-large spacing)}
  :pt0-l {:padding-top (:spacing-none                    spacing)}
  :pt1-l {:padding-top (:spacing-extra-small             spacing)}
  :pt2-l {:padding-top (:spacing-small                   spacing)}
  :pt3-l {:padding-top (:spacing-medium                  spacing)}
  :pt4-l {:padding-top (:spacing-large                   spacing)}
  :pt5-l {:padding-top (:spacing-extra-large             spacing)}
  :pt6-l {:padding-top (:spacing-extra-extra-large       spacing)}
  :pt7-l {:padding-top (:spacing-extra-extra-extra-large spacing)}
  :pv0-l {:padding-top (:spacing-none                    spacing) :padding-bottom (:spacing-none                    spacing)}
  :pv1-l {:padding-top (:spacing-extra-small             spacing) :padding-bottom (:spacing-extra-small             spacing)}
  :pv2-l {:padding-top (:spacing-small                   spacing) :padding-bottom (:spacing-small                   spacing)}
  :pv3-l {:padding-top (:spacing-medium                  spacing) :padding-bottom (:spacing-medium                  spacing)}
  :pv4-l {:padding-top (:spacing-large                   spacing) :padding-bottom (:spacing-large                   spacing)}
  :pv5-l {:padding-top (:spacing-extra-large             spacing) :padding-bottom (:spacing-extra-large             spacing)}
  :pv6-l {:padding-top (:spacing-extra-extra-large       spacing) :padding-bottom (:spacing-extra-extra-large       spacing)}
  :pv7-l {:padding-top (:spacing-extra-extra-extra-large spacing) :padding-bottom (:spacing-extra-extra-extra-large spacing)}
  :ph0-l {:padding-left (:spacing-none                    spacing) :padding-right (:spacing-none                    spacing)}
  :ph1-l {:padding-left (:spacing-extra-small             spacing) :padding-right (:spacing-extra-small             spacing)}
  :ph2-l {:padding-left (:spacing-small                   spacing) :padding-right (:spacing-small                   spacing)}
  :ph3-l {:padding-left (:spacing-medium                  spacing) :padding-right (:spacing-medium                  spacing)}
  :ph4-l {:padding-left (:spacing-large                   spacing) :padding-right (:spacing-large                   spacing)}
  :ph5-l {:padding-left (:spacing-extra-large             spacing) :padding-right (:spacing-extra-large             spacing)}
  :ph6-l {:padding-left (:spacing-extra-extra-large       spacing) :padding-right (:spacing-extra-extra-large       spacing)}
  :ph7-l {:padding-left (:spacing-extra-extra-extra-large spacing) :padding-right (:spacing-extra-extra-extra-large spacing)}
  :ma0-l {:margin (:spacing-none                    spacing)}
  :ma1-l {:margin (:spacing-extra-small             spacing)}
  :ma2-l {:margin (:spacing-small                   spacing)}
  :ma3-l {:margin (:spacing-medium                  spacing)}
  :ma4-l {:margin (:spacing-large                   spacing)}
  :ma5-l {:margin (:spacing-extra-large             spacing)}
  :ma6-l {:margin (:spacing-extra-extra-large       spacing)}
  :ma7-l {:margin (:spacing-extra-extra-extra-large spacing)}
  :ml0-l {:margin-left (:spacing-none                    spacing)}
  :ml1-l {:margin-left (:spacing-extra-small             spacing)}
  :ml2-l {:margin-left (:spacing-small                   spacing)}
  :ml3-l {:margin-left (:spacing-medium                  spacing)}
  :ml4-l {:margin-left (:spacing-large                   spacing)}
  :ml5-l {:margin-left (:spacing-extra-large             spacing)}
  :ml6-l {:margin-left (:spacing-extra-extra-large       spacing)}
  :ml7-l {:margin-left (:spacing-extra-extra-extra-large spacing)}
  :mr0-l {:margin-right (:spacing-none                    spacing)}
  :mr1-l {:margin-right (:spacing-extra-small             spacing)}
  :mr2-l {:margin-right (:spacing-small                   spacing)}
  :mr3-l {:margin-right (:spacing-medium                  spacing)}
  :mr4-l {:margin-right (:spacing-large                   spacing)}
  :mr5-l {:margin-right (:spacing-extra-large             spacing)}
  :mr6-l {:margin-right (:spacing-extra-extra-large       spacing)}
  :mr7-l {:margin-right (:spacing-extra-extra-extra-large spacing)}
  :mb0-l {:margin-bottom (:spacing-none                    spacing)}
  :mb1-l {:margin-bottom (:spacing-extra-small             spacing)}
  :mb2-l {:margin-bottom (:spacing-small                   spacing)}
  :mb3-l {:margin-bottom (:spacing-medium                  spacing)}
  :mb4-l {:margin-bottom (:spacing-large                   spacing)}
  :mb5-l {:margin-bottom (:spacing-extra-large             spacing)}
  :mb6-l {:margin-bottom (:spacing-extra-extra-large       spacing)}
  :mb7-l {:margin-bottom (:spacing-extra-extra-extra-large spacing)}
  :mt0-l {:margin-top (:spacing-none                    spacing)}
  :mt1-l {:margin-top (:spacing-extra-small             spacing)}
  :mt2-l {:margin-top (:spacing-small                   spacing)}
  :mt3-l {:margin-top (:spacing-medium                  spacing)}
  :mt4-l {:margin-top (:spacing-large                   spacing)}
  :mt5-l {:margin-top (:spacing-extra-large             spacing)}
  :mt6-l {:margin-top (:spacing-extra-extra-large       spacing)}
  :mt7-l {:margin-top (:spacing-extra-extra-extra-large spacing)}
  :mv0-l {:margin-top (:spacing-none                    spacing) :margin-bottom (:spacing-none                    spacing)}
  :mv1-l {:margin-top (:spacing-extra-small             spacing) :margin-bottom (:spacing-extra-small             spacing)}
  :mv2-l {:margin-top (:spacing-small                   spacing) :margin-bottom (:spacing-small                   spacing)}
  :mv3-l {:margin-top (:spacing-medium                  spacing) :margin-bottom (:spacing-medium                  spacing)}
  :mv4-l {:margin-top (:spacing-large                   spacing) :margin-bottom (:spacing-large                   spacing)}
  :mv5-l {:margin-top (:spacing-extra-large             spacing) :margin-bottom (:spacing-extra-large             spacing)}
  :mv6-l {:margin-top (:spacing-extra-extra-large       spacing) :margin-bottom (:spacing-extra-extra-large       spacing)}
  :mv7-l {:margin-top (:spacing-extra-extra-extra-large spacing) :margin-bottom (:spacing-extra-extra-extra-large spacing)}
  :mh0-l {:margin-left (:spacing-none                    spacing) :margin-right (:spacing-none                    spacing)}
  :mh1-l {:margin-left (:spacing-extra-small             spacing) :margin-right (:spacing-extra-small             spacing)}
  :mh2-l {:margin-left (:spacing-small                   spacing) :margin-right (:spacing-small                   spacing)}
  :mh3-l {:margin-left (:spacing-medium                  spacing) :margin-right (:spacing-medium                  spacing)}
  :mh4-l {:margin-left (:spacing-large                   spacing) :margin-right (:spacing-large                   spacing)}
  :mh5-l {:margin-left (:spacing-extra-large             spacing) :margin-right (:spacing-extra-large             spacing)}
  :mh6-l {:margin-left (:spacing-extra-extra-large       spacing) :margin-right (:spacing-extra-extra-large       spacing)}
  :mh7-l {:margin-left (:spacing-extra-extra-extra-large spacing) :margin-right (:spacing-extra-extra-extra-large spacing)})
