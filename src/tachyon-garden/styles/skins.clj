(ns tachyon-garden.styles.skins
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]))

(def styledefs
  {:black-90         {:color (color :black-90)}
   :black-80         {:color (color :black-80)}
   :black-70         {:color (color :black-70)}
   :black-60         {:color (color :black-60)}
   :black-50         {:color (color :black-50)}
   :black-40         {:color (color :black-40)}
   :black-30         {:color (color :black-30)}
   :black-20         {:color (color :black-20)}
   :black-10         {:color (color :black-10)}
   :black-05         {:color (color :black-05)}
   :white-90         {:color (color :white-90)}
   :white-80         {:color (color :white-80)}
   :white-70         {:color (color :white-70)}
   :white-60         {:color (color :white-60)}
   :white-50         {:color (color :white-50)}
   :white-40         {:color (color :white-40)}
   :white-30         {:color (color :white-30)}
   :white-20         {:color (color :white-20)}
   :white-10         {:color (color :white-10)}
   :black            {:color (color :black)}
   :near-black       {:color (color :near-black   )}
   :dark-gray        {:color (color :dark-gray    )}
   :mid-gray         {:color (color :mid-gray     )}
   :gray             {:color (color :gray         )}
   :silver           {:color (color :silver       )}
   :light-silver     {:color (color :light-silver )}
   :moon-gray        {:color (color :moon-gray    )}
   :light-gray       {:color (color :light-gray   )}
   :near-white       {:color (color :near-white   )}
   :white            {:color (color :white        )}
   :dark-red         {:color (color :dark-red     )}
   :red              {:color (color :red          )}
   :light-red        {:color (color :light-red    )}
   :orange           {:color (color :orange       )}
   :gold             {:color (color :gold         )}
   :yellow           {:color (color :yellow       )}
   :light-yellow     {:color (color :light-yellow )}
   :purple           {:color (color :purple       )}
   :light-purple     {:color (color :light-purple )}
   :dark-pink        {:color (color :dark-pink    )}
   :hot-pink         {:color (color :hot-pink     )}
   :pink             {:color (color :pink         )}
   :light-pink       {:color (color :light-pink   )}
   :dark-green       {:color (color :dark-green   )}
   :green            {:color (color :green        )}
   :light-green      {:color (color :light-green  )}
   :navy             {:color (color :navy         )}
   :dark-blue        {:color (color :dark-blue    )}
   :blue             {:color (color :blue         )}
   :light-blue       {:color (color :light-blue   )}
   :lightest-blue    {:color (color :lightest-blue)}
   :washed-blue      {:color (color :washed-blue  )}
   :washed-green     {:color (color :washed-green )}
   :washed-yellow    {:color (color :washed-yellow)}
   :washed-red       {:color (color :washed-red   )}
   :color-inherit    {:color :inherit}
   :bg-black-90      {:background-color (color :black-90)}
   :bg-black-80      {:background-color (color :black-80)}
   :bg-black-70      {:background-color (color :black-70)}
   :bg-black-60      {:background-color (color :black-60)}
   :bg-black-50      {:background-color (color :black-50)}
   :bg-black-40      {:background-color (color :black-40)}
   :bg-black-30      {:background-color (color :black-30)}
   :bg-black-20      {:background-color (color :black-20)}
   :bg-black-10      {:background-color (color :black-10)}
   :bg-black-05      {:background-color (color :black-05)}
   :bg-white-90      {:background-color (color :white-90)}
   :bg-white-80      {:background-color (color :white-80)}
   :bg-white-70      {:background-color (color :white-70)}
   :bg-white-60      {:background-color (color :white-60)}
   :bg-white-50      {:background-color (color :white-50)}
   :bg-white-40      {:background-color (color :white-40)}
   :bg-white-30      {:background-color (color :white-30)}
   :bg-white-20      {:background-color (color :white-20)}
   :bg-white-10      {:background-color (color :white-10)}
   :bg-black         {:background-color (color :black)}
   :bg-near-black    {:background-color (color :near-black   )}
   :bg-dark-gray     {:background-color (color :dark-gray    )}
   :bg-mid-gray      {:background-color (color :mid-gray     )}
   :bg-gray          {:background-color (color :gray         )}
   :bg-silver        {:background-color (color :silver       )}
   :bg-light-silver  {:background-color (color :light-silver )}
   :bg-moon-gray     {:background-color (color :moon-gray    )}
   :bg-light-gray    {:background-color (color :light-gray   )}
   :bg-near-white    {:background-color (color :near-white   )}
   :bg-white         {:background-color (color :white        )}
   :bg-transparent   {:background-color (color :transparent  )}
   :bg-dark-red      {:background-color (color :dark-red     )}
   :bg-red           {:background-color (color :red          )}
   :bg-light-red     {:background-color (color :light-red    )}
   :bg-orange        {:background-color (color :orange       )}
   :bg-gold          {:background-color (color :gold         )}
   :bg-yellow        {:background-color (color :yellow       )}
   :bg-light-yellow  {:background-color (color :light-yellow )}
   :bg-purple        {:background-color (color :purple       )}
   :bg-light-purple  {:background-color (color :light-purple )}
   :bg-dark-pink     {:background-color (color :dark-pink    )}
   :bg-hot-pink      {:background-color (color :hot-pink     )}
   :bg-pink          {:background-color (color :pink         )}
   :bg-light-pink    {:background-color (color :light-pink   )}
   :bg-dark-green    {:background-color (color :dark-green   )}
   :bg-green         {:background-color (color :green        )}
   :bg-light-green   {:background-color (color :light-green  )}
   :bg-navy          {:background-color (color :navy         )}
   :bg-dark-blue     {:background-color (color :dark-blue    )}
   :bg-blue          {:background-color (color :blue         )}
   :bg-light-blue    {:background-color (color :light-blue   )}
   :bg-lightest-blue {:background-color (color :lightest-blue)}
   :bg-washed-blue   {:background-color (color :washed-blue  )}
   :bg-washed-green  {:background-color (color :washed-green )}
   :bg-washed-yellow {:background-color (color :washed-yellow)}
   :bg-washed-red    {:background-color (color :washed-red   )}
   :bg-inherit       {:background-color :inherit}})
