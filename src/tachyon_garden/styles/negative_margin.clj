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
  {:npa1 {:padding (:spacing-extra-small             spacing)}
   :npa2 {:padding (:spacing-small                   spacing)}
   :npa3 {:padding (:spacing-medium                  spacing)}
   :npa4 {:padding (:spacing-large                   spacing)}
   :npa5 {:padding (:spacing-extra-large             spacing)}
   :npa6 {:padding (:spacing-extra-extra-large       spacing)}
   :npa7 {:padding (:spacing-extra-extra-extra-large spacing)}
   :npl1 {:padding-left (:spacing-extra-small             spacing)}
   :npl2 {:padding-left (:spacing-small                   spacing)}
   :npl3 {:padding-left (:spacing-medium                  spacing)}
   :npl4 {:padding-left (:spacing-large                   spacing)}
   :npl5 {:padding-left (:spacing-extra-large             spacing)}
   :npl6 {:padding-left (:spacing-extra-extra-large       spacing)}
   :npl7 {:padding-left (:spacing-extra-extra-extra-large spacing)}
   :npr1 {:padding-right (:spacing-extra-small             spacing)}
   :npr2 {:padding-right (:spacing-small                   spacing)}
   :npr3 {:padding-right (:spacing-medium                  spacing)}
   :npr4 {:padding-right (:spacing-large                   spacing)}
   :npr5 {:padding-right (:spacing-extra-large             spacing)}
   :npr6 {:padding-right (:spacing-extra-extra-large       spacing)}
   :npr7 {:padding-right (:spacing-extra-extra-extra-large spacing)}
   :npb1 {:padding-bottom (:spacing-extra-small             spacing)}
   :npb2 {:padding-bottom (:spacing-small                   spacing)}
   :npb3 {:padding-bottom (:spacing-medium                  spacing)}
   :npb4 {:padding-bottom (:spacing-large                   spacing)}
   :npb5 {:padding-bottom (:spacing-extra-large             spacing)}
   :npb6 {:padding-bottom (:spacing-extra-extra-large       spacing)}
   :npb7 {:padding-bottom (:spacing-extra-extra-extra-large spacing)}
   :npt1 {:padding-top (:spacing-extra-small             spacing)}
   :npt2 {:padding-top (:spacing-small                   spacing)}
   :npt3 {:padding-top (:spacing-medium                  spacing)}
   :npt4 {:padding-top (:spacing-large                   spacing)}
   :npt5 {:padding-top (:spacing-extra-large             spacing)}
   :npt6 {:padding-top (:spacing-extra-extra-large       spacing)}
   :npt7 {:padding-top (:spacing-extra-extra-extra-large spacing)}
   :npv1 {:padding-top (:spacing-extra-small             spacing) :padding-bottom (:spacing-extra-small             spacing)}
   :npv2 {:padding-top (:spacing-small                   spacing) :padding-bottom (:spacing-small                   spacing)}
   :npv3 {:padding-top (:spacing-medium                  spacing) :padding-bottom (:spacing-medium                  spacing)}
   :npv4 {:padding-top (:spacing-large                   spacing) :padding-bottom (:spacing-large                   spacing)}
   :npv5 {:padding-top (:spacing-extra-large             spacing) :padding-bottom (:spacing-extra-large             spacing)}
   :npv6 {:padding-top (:spacing-extra-extra-large       spacing) :padding-bottom (:spacing-extra-extra-large       spacing)}
   :npv7 {:padding-top (:spacing-extra-extra-extra-large spacing) :padding-bottom (:spacing-extra-extra-extra-large spacing)}
   :nph1 {:padding-left (:spacing-extra-small             spacing) :padding-right (:spacing-extra-small             spacing)}
   :nph2 {:padding-left (:spacing-small                   spacing) :padding-right (:spacing-small                   spacing)}
   :nph3 {:padding-left (:spacing-medium                  spacing) :padding-right (:spacing-medium                  spacing)}
   :nph4 {:padding-left (:spacing-large                   spacing) :padding-right (:spacing-large                   spacing)}
   :nph5 {:padding-left (:spacing-extra-large             spacing) :padding-right (:spacing-extra-large             spacing)}
   :nph6 {:padding-left (:spacing-extra-extra-large       spacing) :padding-right (:spacing-extra-extra-large       spacing)}
   :nph7 {:padding-left (:spacing-extra-extra-extra-large spacing) :padding-right (:spacing-extra-extra-extra-large spacing)}
   :nma1 {:margin (:spacing-extra-small             spacing)}
   :nma2 {:margin (:spacing-small                   spacing)}
   :nma3 {:margin (:spacing-medium                  spacing)}
   :nma4 {:margin (:spacing-large                   spacing)}
   :nma5 {:margin (:spacing-extra-large             spacing)}
   :nma6 {:margin (:spacing-extra-extra-large       spacing)}
   :nma7 {:margin (:spacing-extra-extra-extra-large spacing)}
   :nml1 {:margin-left (:spacing-extra-small             spacing)}
   :nml2 {:margin-left (:spacing-small                   spacing)}
   :nml3 {:margin-left (:spacing-medium                  spacing)}
   :nml4 {:margin-left (:spacing-large                   spacing)}
   :nml5 {:margin-left (:spacing-extra-large             spacing)}
   :nml6 {:margin-left (:spacing-extra-extra-large       spacing)}
   :nml7 {:margin-left (:spacing-extra-extra-extra-large spacing)}
   :nmr1 {:margin-right (:spacing-extra-small             spacing)}
   :nmr2 {:margin-right (:spacing-small                   spacing)}
   :nmr3 {:margin-right (:spacing-medium                  spacing)}
   :nmr4 {:margin-right (:spacing-large                   spacing)}
   :nmr5 {:margin-right (:spacing-extra-large             spacing)}
   :nmr6 {:margin-right (:spacing-extra-extra-large       spacing)}
   :nmr7 {:margin-right (:spacing-extra-extra-extra-large spacing)}
   :nmb1 {:margin-bottom (:spacing-extra-small             spacing)}
   :nmb2 {:margin-bottom (:spacing-small                   spacing)}
   :nmb3 {:margin-bottom (:spacing-medium                  spacing)}
   :nmb4 {:margin-bottom (:spacing-large                   spacing)}
   :nmb5 {:margin-bottom (:spacing-extra-large             spacing)}
   :nmb6 {:margin-bottom (:spacing-extra-extra-large       spacing)}
   :nmb7 {:margin-bottom (:spacing-extra-extra-extra-large spacing)}
   :nmt1 {:margin-top (:spacing-extra-small             spacing)}
   :nmt2 {:margin-top (:spacing-small                   spacing)}
   :nmt3 {:margin-top (:spacing-medium                  spacing)}
   :nmt4 {:margin-top (:spacing-large                   spacing)}
   :nmt5 {:margin-top (:spacing-extra-large             spacing)}
   :nmt6 {:margin-top (:spacing-extra-extra-large       spacing)}
   :nmt7 {:margin-top (:spacing-extra-extra-extra-large spacing)}
   :nmv1 {:margin-top (:spacing-extra-small             spacing) :margin-bottom (:spacing-extra-small             spacing)}
   :nmv2 {:margin-top (:spacing-small                   spacing) :margin-bottom (:spacing-small                   spacing)}
   :nmv3 {:margin-top (:spacing-medium                  spacing) :margin-bottom (:spacing-medium                  spacing)}
   :nmv4 {:margin-top (:spacing-large                   spacing) :margin-bottom (:spacing-large                   spacing)}
   :nmv5 {:margin-top (:spacing-extra-large             spacing) :margin-bottom (:spacing-extra-large             spacing)}
   :nmv6 {:margin-top (:spacing-extra-extra-large       spacing) :margin-bottom (:spacing-extra-extra-large       spacing)}
   :nmv7 {:margin-top (:spacing-extra-extra-extra-large spacing) :margin-bottom (:spacing-extra-extra-extra-large spacing)}
   :nmh1 {:margin-left (:spacing-extra-small             spacing) :margin-right (:spacing-extra-small             spacing)}
   :nmh2 {:margin-left (:spacing-small                   spacing) :margin-right (:spacing-small                   spacing)}
   :nmh3 {:margin-left (:spacing-medium                  spacing) :margin-right (:spacing-medium                  spacing)}
   :nmh4 {:margin-left (:spacing-large                   spacing) :margin-right (:spacing-large                   spacing)}
   :nmh5 {:margin-left (:spacing-extra-large             spacing) :margin-right (:spacing-extra-large             spacing)}
   :nmh6 {:margin-left (:spacing-extra-extra-large       spacing) :margin-right (:spacing-extra-extra-large       spacing)}
   :nmh7 {:margin-left (:spacing-extra-extra-extra-large spacing) :margin-right (:spacing-extra-extra-extra-large spacing)}    
   :npa1-ns {:padding (:spacing-extra-small             spacing)}
   :npa2-ns {:padding (:spacing-small                   spacing)}
   :npa3-ns {:padding (:spacing-medium                  spacing)}
   :npa4-ns {:padding (:spacing-large                   spacing)}
   :npa5-ns {:padding (:spacing-extra-large             spacing)}
   :npa6-ns {:padding (:spacing-extra-extra-large       spacing)}
   :npa7-ns {:padding (:spacing-extra-extra-extra-large spacing)}
   :npl1-ns {:padding-left (:spacing-extra-small             spacing)}
   :npl2-ns {:padding-left (:spacing-small                   spacing)}
   :npl3-ns {:padding-left (:spacing-medium                  spacing)}
   :npl4-ns {:padding-left (:spacing-large                   spacing)}
   :npl5-ns {:padding-left (:spacing-extra-large             spacing)}
   :npl6-ns {:padding-left (:spacing-extra-extra-large       spacing)}
   :npl7-ns {:padding-left (:spacing-extra-extra-extra-large spacing)}
   :npr1-ns {:padding-right (:spacing-extra-small             spacing)}
   :npr2-ns {:padding-right (:spacing-small                   spacing)}
   :npr3-ns {:padding-right (:spacing-medium                  spacing)}
   :npr4-ns {:padding-right (:spacing-large                   spacing)}
   :npr5-ns {:padding-right (:spacing-extra-large             spacing)}
   :npr6-ns {:padding-right (:spacing-extra-extra-large       spacing)}
   :npr7-ns {:padding-right (:spacing-extra-extra-extra-large spacing)}
   :npb1-ns {:padding-bottom (:spacing-extra-small             spacing)}
   :npb2-ns {:padding-bottom (:spacing-small                   spacing)}
   :npb3-ns {:padding-bottom (:spacing-medium                  spacing)}
   :npb4-ns {:padding-bottom (:spacing-large                   spacing)}
   :npb5-ns {:padding-bottom (:spacing-extra-large             spacing)}
   :npb6-ns {:padding-bottom (:spacing-extra-extra-large       spacing)}
   :npb7-ns {:padding-bottom (:spacing-extra-extra-extra-large spacing)}
   :npt1-ns {:padding-top (:spacing-extra-small             spacing)}
   :npt2-ns {:padding-top (:spacing-small                   spacing)}
   :npt3-ns {:padding-top (:spacing-medium                  spacing)}
   :npt4-ns {:padding-top (:spacing-large                   spacing)}
   :npt5-ns {:padding-top (:spacing-extra-large             spacing)}
   :npt6-ns {:padding-top (:spacing-extra-extra-large       spacing)}
   :npt7-ns {:padding-top (:spacing-extra-extra-extra-large spacing)}
   :npv1-ns {:padding-top (:spacing-extra-small             spacing) :padding-bottom (:spacing-extra-small             spacing)}
   :npv2-ns {:padding-top (:spacing-small                   spacing) :padding-bottom (:spacing-small                   spacing)}
   :npv3-ns {:padding-top (:spacing-medium                  spacing) :padding-bottom (:spacing-medium                  spacing)}
   :npv4-ns {:padding-top (:spacing-large                   spacing) :padding-bottom (:spacing-large                   spacing)}
   :npv5-ns {:padding-top (:spacing-extra-large             spacing) :padding-bottom (:spacing-extra-large             spacing)}
   :npv6-ns {:padding-top (:spacing-extra-extra-large       spacing) :padding-bottom (:spacing-extra-extra-large       spacing)}
   :npv7-ns {:padding-top (:spacing-extra-extra-extra-large spacing) :padding-bottom (:spacing-extra-extra-extra-large spacing)}
   :nph1-ns {:padding-left (:spacing-extra-small             spacing) :padding-right (:spacing-extra-small             spacing)}
   :nph2-ns {:padding-left (:spacing-small                   spacing) :padding-right (:spacing-small                   spacing)}
   :nph3-ns {:padding-left (:spacing-medium                  spacing) :padding-right (:spacing-medium                  spacing)}
   :nph4-ns {:padding-left (:spacing-large                   spacing) :padding-right (:spacing-large                   spacing)}
   :nph5-ns {:padding-left (:spacing-extra-large             spacing) :padding-right (:spacing-extra-large             spacing)}
   :nph6-ns {:padding-left (:spacing-extra-extra-large       spacing) :padding-right (:spacing-extra-extra-large       spacing)}
   :nph7-ns {:padding-left (:spacing-extra-extra-extra-large spacing) :padding-right (:spacing-extra-extra-extra-large spacing)}
   :nma1-ns {:margin (:spacing-extra-small             spacing)}
   :nma2-ns {:margin (:spacing-small                   spacing)}
   :nma3-ns {:margin (:spacing-medium                  spacing)}
   :nma4-ns {:margin (:spacing-large                   spacing)}
   :nma5-ns {:margin (:spacing-extra-large             spacing)}
   :nma6-ns {:margin (:spacing-extra-extra-large       spacing)}
   :nma7-ns {:margin (:spacing-extra-extra-extra-large spacing)}
   :nml1-ns {:margin-left (:spacing-extra-small             spacing)}
   :nml2-ns {:margin-left (:spacing-small                   spacing)}
   :nml3-ns {:margin-left (:spacing-medium                  spacing)}
   :nml4-ns {:margin-left (:spacing-large                   spacing)}
   :nml5-ns {:margin-left (:spacing-extra-large             spacing)}
   :nml6-ns {:margin-left (:spacing-extra-extra-large       spacing)}
   :nml7-ns {:margin-left (:spacing-extra-extra-extra-large spacing)}
   :nmr1-ns {:margin-right (:spacing-extra-small             spacing)}
   :nmr2-ns {:margin-right (:spacing-small                   spacing)}
   :nmr3-ns {:margin-right (:spacing-medium                  spacing)}
   :nmr4-ns {:margin-right (:spacing-large                   spacing)}
   :nmr5-ns {:margin-right (:spacing-extra-large             spacing)}
   :nmr6-ns {:margin-right (:spacing-extra-extra-large       spacing)}
   :nmr7-ns {:margin-right (:spacing-extra-extra-extra-large spacing)}
   :nmb1-ns {:margin-bottom (:spacing-extra-small             spacing)}
   :nmb2-ns {:margin-bottom (:spacing-small                   spacing)}
   :nmb3-ns {:margin-bottom (:spacing-medium                  spacing)}
   :nmb4-ns {:margin-bottom (:spacing-large                   spacing)}
   :nmb5-ns {:margin-bottom (:spacing-extra-large             spacing)}
   :nmb6-ns {:margin-bottom (:spacing-extra-extra-large       spacing)}
   :nmb7-ns {:margin-bottom (:spacing-extra-extra-extra-large spacing)}
   :nmt1-ns {:margin-top (:spacing-extra-small             spacing)}
   :nmt2-ns {:margin-top (:spacing-small                   spacing)}
   :nmt3-ns {:margin-top (:spacing-medium                  spacing)}
   :nmt4-ns {:margin-top (:spacing-large                   spacing)}
   :nmt5-ns {:margin-top (:spacing-extra-large             spacing)}
   :nmt6-ns {:margin-top (:spacing-extra-extra-large       spacing)}
   :nmt7-ns {:margin-top (:spacing-extra-extra-extra-large spacing)}
   :nmv1-ns {:margin-top (:spacing-extra-small             spacing) :margin-bottom (:spacing-extra-small             spacing)}
   :nmv2-ns {:margin-top (:spacing-small                   spacing) :margin-bottom (:spacing-small                   spacing)}
   :nmv3-ns {:margin-top (:spacing-medium                  spacing) :margin-bottom (:spacing-medium                  spacing)}
   :nmv4-ns {:margin-top (:spacing-large                   spacing) :margin-bottom (:spacing-large                   spacing)}
   :nmv5-ns {:margin-top (:spacing-extra-large             spacing) :margin-bottom (:spacing-extra-large             spacing)}
   :nmv6-ns {:margin-top (:spacing-extra-extra-large       spacing) :margin-bottom (:spacing-extra-extra-large       spacing)}
   :nmv7-ns {:margin-top (:spacing-extra-extra-extra-large spacing) :margin-bottom (:spacing-extra-extra-extra-large spacing)}
   :nmh1-ns {:margin-left (:spacing-extra-small             spacing) :margin-right (:spacing-extra-small             spacing)}
   :nmh2-ns {:margin-left (:spacing-small                   spacing) :margin-right (:spacing-small                   spacing)}
   :nmh3-ns {:margin-left (:spacing-medium                  spacing) :margin-right (:spacing-medium                  spacing)}
   :nmh4-ns {:margin-left (:spacing-large                   spacing) :margin-right (:spacing-large                   spacing)}
   :nmh5-ns {:margin-left (:spacing-extra-large             spacing) :margin-right (:spacing-extra-large             spacing)}
   :nmh6-ns {:margin-left (:spacing-extra-extra-large       spacing) :margin-right (:spacing-extra-extra-large       spacing)}
   :nmh7-ns {:margin-left (:spacing-extra-extra-extra-large spacing) :margin-right (:spacing-extra-extra-extra-large spacing)}
   :npa1-m {:padding (:spacing-extra-small             spacing)}
   :npa2-m {:padding (:spacing-small                   spacing)}
   :npa3-m {:padding (:spacing-medium                  spacing)}
   :npa4-m {:padding (:spacing-large                   spacing)}
   :npa5-m {:padding (:spacing-extra-large             spacing)}
   :npa6-m {:padding (:spacing-extra-extra-large       spacing)}
   :npa7-m {:padding (:spacing-extra-extra-extra-large spacing)}
   :npl1-m {:padding-left (:spacing-extra-small             spacing)}
   :npl2-m {:padding-left (:spacing-small                   spacing)}
   :npl3-m {:padding-left (:spacing-medium                  spacing)}
   :npl4-m {:padding-left (:spacing-large                   spacing)}
   :npl5-m {:padding-left (:spacing-extra-large             spacing)}
   :npl6-m {:padding-left (:spacing-extra-extra-large       spacing)}
   :npl7-m {:padding-left (:spacing-extra-extra-extra-large spacing)}
   :npr1-m {:padding-right (:spacing-extra-small             spacing)}
   :npr2-m {:padding-right (:spacing-small                   spacing)}
   :npr3-m {:padding-right (:spacing-medium                  spacing)}
   :npr4-m {:padding-right (:spacing-large                   spacing)}
   :npr5-m {:padding-right (:spacing-extra-large             spacing)}
   :npr6-m {:padding-right (:spacing-extra-extra-large       spacing)}
   :npr7-m {:padding-right (:spacing-extra-extra-extra-large spacing)}
   :npb1-m {:padding-bottom (:spacing-extra-small             spacing)}
   :npb2-m {:padding-bottom (:spacing-small                   spacing)}
   :npb3-m {:padding-bottom (:spacing-medium                  spacing)}
   :npb4-m {:padding-bottom (:spacing-large                   spacing)}
   :npb5-m {:padding-bottom (:spacing-extra-large             spacing)}
   :npb6-m {:padding-bottom (:spacing-extra-extra-large       spacing)}
   :npb7-m {:padding-bottom (:spacing-extra-extra-extra-large spacing)}
   :npt1-m {:padding-top (:spacing-extra-small             spacing)}
   :npt2-m {:padding-top (:spacing-small                   spacing)}
   :npt3-m {:padding-top (:spacing-medium                  spacing)}
   :npt4-m {:padding-top (:spacing-large                   spacing)}
   :npt5-m {:padding-top (:spacing-extra-large             spacing)}
   :npt6-m {:padding-top (:spacing-extra-extra-large       spacing)}
   :npt7-m {:padding-top (:spacing-extra-extra-extra-large spacing)}
   :npv1-m {:padding-top (:spacing-extra-small             spacing) :padding-bottom (:spacing-extra-small             spacing)}
   :npv2-m {:padding-top (:spacing-small                   spacing) :padding-bottom (:spacing-small                   spacing)}
   :npv3-m {:padding-top (:spacing-medium                  spacing) :padding-bottom (:spacing-medium                  spacing)}
   :npv4-m {:padding-top (:spacing-large                   spacing) :padding-bottom (:spacing-large                   spacing)}
   :npv5-m {:padding-top (:spacing-extra-large             spacing) :padding-bottom (:spacing-extra-large             spacing)}
   :npv6-m {:padding-top (:spacing-extra-extra-large       spacing) :padding-bottom (:spacing-extra-extra-large       spacing)}
   :npv7-m {:padding-top (:spacing-extra-extra-extra-large spacing) :padding-bottom (:spacing-extra-extra-extra-large spacing)}
   :nph1-m {:padding-left (:spacing-extra-small             spacing) :padding-right (:spacing-extra-small             spacing)}
   :nph2-m {:padding-left (:spacing-small                   spacing) :padding-right (:spacing-small                   spacing)}
   :nph3-m {:padding-left (:spacing-medium                  spacing) :padding-right (:spacing-medium                  spacing)}
   :nph4-m {:padding-left (:spacing-large                   spacing) :padding-right (:spacing-large                   spacing)}
   :nph5-m {:padding-left (:spacing-extra-large             spacing) :padding-right (:spacing-extra-large             spacing)}
   :nph6-m {:padding-left (:spacing-extra-extra-large       spacing) :padding-right (:spacing-extra-extra-large       spacing)}
   :nph7-m {:padding-left (:spacing-extra-extra-extra-large spacing) :padding-right (:spacing-extra-extra-extra-large spacing)}
   :nma1-m {:margin (:spacing-extra-small             spacing)}
   :nma2-m {:margin (:spacing-small                   spacing)}
   :nma3-m {:margin (:spacing-medium                  spacing)}
   :nma4-m {:margin (:spacing-large                   spacing)}
   :nma5-m {:margin (:spacing-extra-large             spacing)}
   :nma6-m {:margin (:spacing-extra-extra-large       spacing)}
   :nma7-m {:margin (:spacing-extra-extra-extra-large spacing)}
   :nml1-m {:margin-left (:spacing-extra-small             spacing)}
   :nml2-m {:margin-left (:spacing-small                   spacing)}
   :nml3-m {:margin-left (:spacing-medium                  spacing)}
   :nml4-m {:margin-left (:spacing-large                   spacing)}
   :nml5-m {:margin-left (:spacing-extra-large             spacing)}
   :nml6-m {:margin-left (:spacing-extra-extra-large       spacing)}
   :nml7-m {:margin-left (:spacing-extra-extra-extra-large spacing)}
   :nmr1-m {:margin-right (:spacing-extra-small             spacing)}
   :nmr2-m {:margin-right (:spacing-small                   spacing)}
   :nmr3-m {:margin-right (:spacing-medium                  spacing)}
   :nmr4-m {:margin-right (:spacing-large                   spacing)}
   :nmr5-m {:margin-right (:spacing-extra-large             spacing)}
   :nmr6-m {:margin-right (:spacing-extra-extra-large       spacing)}
   :nmr7-m {:margin-right (:spacing-extra-extra-extra-large spacing)}
   :nmt1-m {:margin-top (:spacing-extra-small             spacing)}
   :nmt2-m {:margin-top (:spacing-small                   spacing)}
   :nmt3-m {:margin-top (:spacing-medium                  spacing)}
   :nmt4-m {:margin-top (:spacing-large                   spacing)}
   :nmt5-m {:margin-top (:spacing-extra-large             spacing)}
   :nmt6-m {:margin-top (:spacing-extra-extra-large       spacing)}
   :nmt7-m {:margin-top (:spacing-extra-extra-extra-large spacing)}
   :nmv1-m {:margin-top (:spacing-extra-small             spacing) :margin-bottom (:spacing-extra-small             spacing)}
   :nmv2-m {:margin-top (:spacing-small                   spacing) :margin-bottom (:spacing-small                   spacing)}
   :nmv3-m {:margin-top (:spacing-medium                  spacing) :margin-bottom (:spacing-medium                  spacing)}
   :nmv4-m {:margin-top (:spacing-large                   spacing) :margin-bottom (:spacing-large                   spacing)}
   :nmv5-m {:margin-top (:spacing-extra-large             spacing) :margin-bottom (:spacing-extra-large             spacing)}
   :nmv6-m {:margin-top (:spacing-extra-extra-large       spacing) :margin-bottom (:spacing-extra-extra-large       spacing)}
   :nmv7-m {:margin-top (:spacing-extra-extra-extra-large spacing) :margin-bottom (:spacing-extra-extra-extra-large spacing)}
   :nmh1-m {:margin-left (:spacing-extra-small             spacing) :margin-right (:spacing-extra-small             spacing)}
   :nmh2-m {:margin-left (:spacing-small                   spacing) :margin-right (:spacing-small                   spacing)}
   :nmh3-m {:margin-left (:spacing-medium                  spacing) :margin-right (:spacing-medium                  spacing)}
   :nmh4-m {:margin-left (:spacing-large                   spacing) :margin-right (:spacing-large                   spacing)}
   :nmh5-m {:margin-left (:spacing-extra-large             spacing) :margin-right (:spacing-extra-large             spacing)}
   :nmh6-m {:margin-left (:spacing-extra-extra-large       spacing) :margin-right (:spacing-extra-extra-large       spacing)}
   :nmh7-m {:margin-left (:spacing-extra-extra-extra-large spacing) :margin-right (:spacing-extra-extra-extra-large spacing)}
   :npa1-l {:padding (:spacing-extra-small             spacing)}
   :npa2-l {:padding (:spacing-small                   spacing)}
   :npa3-l {:padding (:spacing-medium                  spacing)}
   :npa4-l {:padding (:spacing-large                   spacing)}
   :npa5-l {:padding (:spacing-extra-large             spacing)}
   :npa6-l {:padding (:spacing-extra-extra-large       spacing)}
   :npa7-l {:padding (:spacing-extra-extra-extra-large spacing)}
   :npl1-l {:padding-left (:spacing-extra-small             spacing)}
   :npl2-l {:padding-left (:spacing-small                   spacing)}
   :npl3-l {:padding-left (:spacing-medium                  spacing)}
   :npl4-l {:padding-left (:spacing-large                   spacing)}
   :npl5-l {:padding-left (:spacing-extra-large             spacing)}
   :npl6-l {:padding-left (:spacing-extra-extra-large       spacing)}
   :npl7-l {:padding-left (:spacing-extra-extra-extra-large spacing)}
   :npr1-l {:padding-right (:spacing-extra-small             spacing)}
   :npr2-l {:padding-right (:spacing-small                   spacing)}
   :npr3-l {:padding-right (:spacing-medium                  spacing)}
   :npr4-l {:padding-right (:spacing-large                   spacing)}
   :npr5-l {:padding-right (:spacing-extra-large             spacing)}
   :npr6-l {:padding-right (:spacing-extra-extra-large       spacing)}
   :npr7-l {:padding-right (:spacing-extra-extra-extra-large spacing)}
   :npb1-l {:padding-bottom (:spacing-extra-small             spacing)}
   :npb2-l {:padding-bottom (:spacing-small                   spacing)}
   :npb3-l {:padding-bottom (:spacing-medium                  spacing)}
   :npb4-l {:padding-bottom (:spacing-large                   spacing)}
   :npb5-l {:padding-bottom (:spacing-extra-large             spacing)}
   :npb6-l {:padding-bottom (:spacing-extra-extra-large       spacing)}
   :npb7-l {:padding-bottom (:spacing-extra-extra-extra-large spacing)}
   :npt1-l {:padding-top (:spacing-extra-small             spacing)}
   :npt2-l {:padding-top (:spacing-small                   spacing)}
   :npt3-l {:padding-top (:spacing-medium                  spacing)}
   :npt4-l {:padding-top (:spacing-large                   spacing)}
   :npt5-l {:padding-top (:spacing-extra-large             spacing)}
   :npt6-l {:padding-top (:spacing-extra-extra-large       spacing)}
   :npt7-l {:padding-top (:spacing-extra-extra-extra-large spacing)}
   :npv1-l {:padding-top (:spacing-extra-small             spacing) :padding-bottom (:spacing-extra-small             spacing)}
   :npv2-l {:padding-top (:spacing-small                   spacing) :padding-bottom (:spacing-small                   spacing)}
   :npv3-l {:padding-top (:spacing-medium                  spacing) :padding-bottom (:spacing-medium                  spacing)}
   :npv4-l {:padding-top (:spacing-large                   spacing) :padding-bottom (:spacing-large                   spacing)}
   :npv5-l {:padding-top (:spacing-extra-large             spacing) :padding-bottom (:spacing-extra-large             spacing)}
   :npv6-l {:padding-top (:spacing-extra-extra-large       spacing) :padding-bottom (:spacing-extra-extra-large       spacing)}
   :npv7-l {:padding-top (:spacing-extra-extra-extra-large spacing) :padding-bottom (:spacing-extra-extra-extra-large spacing)}
   :nph1-l {:padding-left (:spacing-extra-small             spacing) :padding-right (:spacing-extra-small             spacing)}
   :nph2-l {:padding-left (:spacing-small                   spacing) :padding-right (:spacing-small                   spacing)}
   :nph3-l {:padding-left (:spacing-medium                  spacing) :padding-right (:spacing-medium                  spacing)}
   :nph4-l {:padding-left (:spacing-large                   spacing) :padding-right (:spacing-large                   spacing)}
   :nph5-l {:padding-left (:spacing-extra-large             spacing) :padding-right (:spacing-extra-large             spacing)}
   :nph6-l {:padding-left (:spacing-extra-extra-large       spacing) :padding-right (:spacing-extra-extra-large       spacing)}
   :nph7-l {:padding-left (:spacing-extra-extra-extra-large spacing) :padding-right (:spacing-extra-extra-extra-large spacing)}
   :nma1-l {:margin (:spacing-extra-small             spacing)}
   :nma2-l {:margin (:spacing-small                   spacing)}
   :nma3-l {:margin (:spacing-medium                  spacing)}
   :nma4-l {:margin (:spacing-large                   spacing)}
   :nma5-l {:margin (:spacing-extra-large             spacing)}
   :nma6-l {:margin (:spacing-extra-extra-large       spacing)}
   :nma7-l {:margin (:spacing-extra-extra-extra-large spacing)}
   :nml1-l {:margin-left (:spacing-extra-small             spacing)}
   :nml2-l {:margin-left (:spacing-small                   spacing)}
   :nml3-l {:margin-left (:spacing-medium                  spacing)}
   :nml4-l {:margin-left (:spacing-large                   spacing)}
   :nml5-l {:margin-left (:spacing-extra-large             spacing)}
   :nml6-l {:margin-left (:spacing-extra-extra-large       spacing)}
   :nml7-l {:margin-left (:spacing-extra-extra-extra-large spacing)}
   :nmr1-l {:margin-right (:spacing-extra-small             spacing)}
   :nmr2-l {:margin-right (:spacing-small                   spacing)}
   :nmr3-l {:margin-right (:spacing-medium                  spacing)}
   :nmr4-l {:margin-right (:spacing-large                   spacing)}
   :nmr5-l {:margin-right (:spacing-extra-large             spacing)}
   :nmr6-l {:margin-right (:spacing-extra-extra-large       spacing)}
   :nmr7-l {:margin-right (:spacing-extra-extra-extra-large spacing)}
   :nmb1-l {:margin-bottom (:spacing-extra-small             spacing)}
   :nmb2-l {:margin-bottom (:spacing-small                   spacing)}
   :nmb3-l {:margin-bottom (:spacing-medium                  spacing)}
   :nmb4-l {:margin-bottom (:spacing-large                   spacing)}
   :nmb5-l {:margin-bottom (:spacing-extra-large             spacing)}
   :nmb6-l {:margin-bottom (:spacing-extra-extra-large       spacing)}
   :nmb7-l {:margin-bottom (:spacing-extra-extra-extra-large spacing)}
   :nmt1-l {:margin-top (:spacing-extra-small             spacing)}
   :nmt2-l {:margin-top (:spacing-small                   spacing)}
   :nmt3-l {:margin-top (:spacing-medium                  spacing)}
   :nmt4-l {:margin-top (:spacing-large                   spacing)}
   :nmt5-l {:margin-top (:spacing-extra-large             spacing)}
   :nmt6-l {:margin-top (:spacing-extra-extra-large       spacing)}
   :nmt7-l {:margin-top (:spacing-extra-extra-extra-large spacing)}
   :nmv1-l {:margin-top (:spacing-extra-small             spacing) :margin-bottom (:spacing-extra-small             spacing)}
   :nmv2-l {:margin-top (:spacing-small                   spacing) :margin-bottom (:spacing-small                   spacing)}
   :nmv3-l {:margin-top (:spacing-medium                  spacing) :margin-bottom (:spacing-medium                  spacing)}
   :nmv4-l {:margin-top (:spacing-large                   spacing) :margin-bottom (:spacing-large                   spacing)}
   :nmv5-l {:margin-top (:spacing-extra-large             spacing) :margin-bottom (:spacing-extra-large             spacing)}
   :nmv6-l {:margin-top (:spacing-extra-extra-large       spacing) :margin-bottom (:spacing-extra-extra-large       spacing)}
   :nmv7-l {:margin-top (:spacing-extra-extra-extra-large spacing) :margin-bottom (:spacing-extra-extra-extra-large spacing)}
   :nmh1-l {:margin-left (:spacing-extra-small             spacing) :margin-right (:spacing-extra-small             spacing)}
   :nmh2-l {:margin-left (:spacing-small                   spacing) :margin-right (:spacing-small                   spacing)}
   :nmh3-l {:margin-left (:spacing-medium                  spacing) :margin-right (:spacing-medium                  spacing)}
   :nmh4-l {:margin-left (:spacing-large                   spacing) :margin-right (:spacing-large                   spacing)}
   :nmh5-l {:margin-left (:spacing-extra-large             spacing) :margin-right (:spacing-extra-large             spacing)}
   :nmh6-l {:margin-left (:spacing-extra-extra-large       spacing) :margin-right (:spacing-extra-extra-large       spacing)}
   :nmh7-l {:margin-left (:spacing-extra-extra-extra-large spacing) :margin-right (:spacing-extra-extra-extra-large spacing)}
   })
