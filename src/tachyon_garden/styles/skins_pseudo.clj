(ns tachyon-garden.styles.skins-pseudo
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]
   [tachyon-garden.styles.color :refer [color]]))

(def styledefs
  {:hover-black             [[[":hover" ":focus"] {:color (color :black)}]]
   :hover-near-black       [[[":hover" ":focus"] {:color (color :near-black  )}]]
   :hover-dark-gray        [[[":hover" ":focus"] {:color (color :dark-gray   )}]]
   :hover-mid-gray         [[[":hover" ":focus"] {:color (color :mid-gray    )}]]
   :hover-gray             [[[":hover" ":focus"] {:color (color :gray        )}]]
   :hover-silver           [[[":hover" ":focus"] {:color (color :silver      )}]]
   :hover-light-silver     [[[":hover" ":focus"] {:color (color :light-silver)}]]
   :hover-moon-gray        [[[":hover" ":focus"] {:color (color :moon-gray   )}]]
   :hover-light-gray       [[[":hover" ":focus"] {:color (color :light-gray  )}]]
   :hover-near-white       [[[":hover" ":focus"] {:color (color :near-white  )}]]
   :hover-white            [[[":hover" ":focus"] {:color (color :white       )}]]
   :hover-black-90         [[[":hover" ":focus"] {:color (color :black-90    )}]]
   :hover-black-80         [[[":hover" ":focus"] {:color (color :black-80    )}]]
   :hover-black-70         [[[":hover" ":focus"] {:color (color :black-70    )}]]
   :hover-black-60         [[[":hover" ":focus"] {:color (color :black-60    )}]]
   :hover-black-50         [[[":hover" ":focus"] {:color (color :black-50    )}]]
   :hover-black-40         [[[":hover" ":focus"] {:color (color :black-40    )}]]
   :hover-black-30         [[[":hover" ":focus"] {:color (color :black-30    )}]]
   :hover-black-20         [[[":hover" ":focus"] {:color (color :black-20    )}]]
   :hover-black-10         [[[":hover" ":focus"] {:color (color :black-10    )}]]
   :hover-white-90         [[[":hover" ":focus"] {:color (color :white-90    )}]]
   :hover-white-80         [[[":hover" ":focus"] {:color (color :white-80    )}]]
   :hover-white-70         [[[":hover" ":focus"] {:color (color :white-70    )}]]
   :hover-white-60         [[[":hover" ":focus"] {:color (color :white-60    )}]]
   :hover-white-50         [[[":hover" ":focus"] {:color (color :white-50    )}]]
   :hover-white-40         [[[":hover" ":focus"] {:color (color :white-40    )}]]
   :hover-white-30         [[[":hover" ":focus"] {:color (color :white-30    )}]]
   :hover-white-20         [[[":hover" ":focus"] {:color (color :white-20    )}]]
   :hover-white-10         [[[":hover" ":focus"] {:color (color :white-10    )}]]
   :hover-inherit          {"color" (clojure.core/str "inherit")}
   :hover-bg-black         [[[":hover" ":focus"] {:background-color (color :black       )}]]
   :hover-bg-near-black    [[[":hover" ":focus"] {:background-color (color :near-black  )}]]
   :hover-bg-dark-gray     [[[":hover" ":focus"] {:background-color (color :dark-gray   )}]]
   :hover-bg-mid-gray      [[[":hover" ":focus"] {:background-color (color :mid-gray    )}]]
   :hover-bg-gray          [[[":hover" ":focus"] {:background-color (color :gray        )}]]
   :hover-bg-silver        [[[":hover" ":focus"] {:background-color (color :silver      )}]]
   :hover-bg-light-silver  [[[":hover" ":focus"] {:background-color (color :light-silver)}]]
   :hover-bg-moon-gray     [[[":hover" ":focus"] {:background-color (color :moon-gray   )}]]
   :hover-bg-light-gray    [[[":hover" ":focus"] {:background-color (color :light-gray  )}]]
   :hover-bg-near-white    [[[":hover" ":focus"] {:background-color (color :near-white  )}]]
   :hover-bg-white         [[[":hover" ":focus"] {:background-color (color :white       )}]]
   :hover-bg-transparent   [[[":hover" ":focus"] {:background-color (color :transparent )}]]
   :hover-bg-black-90      [[[":hover" ":focus"] {:background-color (color :black-90    )}]]
   :hover-bg-black-80      [[[":hover" ":focus"] {:background-color (color :black-80    )}]]
   :hover-bg-black-70      [[[":hover" ":focus"] {:background-color (color :black-70    )}]]
   :hover-bg-black-60      [[[":hover" ":focus"] {:background-color (color :black-60    )}]]
   :hover-bg-black-50      [[[":hover" ":focus"] {:background-color (color :black-50    )}]]
   :hover-bg-black-40      [[[":hover" ":focus"] {:background-color (color :black-40    )}]]
   :hover-bg-black-30      [[[":hover" ":focus"] {:background-color (color :black-30    )}]]
   :hover-bg-black-20      [[[":hover" ":focus"] {:background-color (color :black-20    )}]]
   :hover-bg-black-10      [[[":hover" ":focus"] {:background-color (color :black-10    )}]]
   :hover-bg-white-90      [[[":hover" ":focus"] {:background-color (color :white-90    )}]]
   :hover-bg-white-80      [[[":hover" ":focus"] {:background-color (color :white-80    )}]]
   :hover-bg-white-70      [[[":hover" ":focus"] {:background-color (color :white-70    )}]]
   :hover-bg-white-60      [[[":hover" ":focus"] {:background-color (color :white-60    )}]]
   :hover-bg-white-50      [[[":hover" ":focus"] {:background-color (color :white-50    )}]]
   :hover-bg-white-40      [[[":hover" ":focus"] {:background-color (color :white-40    )}]]
   :hover-bg-white-30      [[[":hover" ":focus"] {:background-color (color :white-30    )}]]
   :hover-bg-white-20      [[[":hover" ":focus"] {:background-color (color :white-20    )}]]
   :hover-bg-white-10      [[[":hover" ":focus"] {:background-color (color :white-10    )}]]
   :hover-dark-red         [[[":hover" ":focus"] {:color (color :dark-red     )}]]
   :hover-red              [[[":hover" ":focus"] {:color (color :red          )}]]
   :hover-light-red        [[[":hover" ":focus"] {:color (color :light-red    )}]]
   :hover-orange           [[[":hover" ":focus"] {:color (color :orange       )}]]
   :hover-gold             [[[":hover" ":focus"] {:color (color :gold         )}]]
   :hover-yellow           [[[":hover" ":focus"] {:color (color :yellow       )}]]
   :hover-light-yellow     [[[":hover" ":focus"] {:color (color :light-yellow )}]]
   :hover-purple           [[[":hover" ":focus"] {:color (color :purple       )}]]
   :hover-light-purple     [[[":hover" ":focus"] {:color (color :light-purple )}]]
   :hover-dark-pink        [[[":hover" ":focus"] {:color (color :dark-pink    )}]]
   :hover-hot-pink         [[[":hover" ":focus"] {:color (color :hot-pink     )}]]
   :hover-pink             [[[":hover" ":focus"] {:color (color :pink         )}]]
   :hover-light-pink       [[[":hover" ":focus"] {:color (color :light-pink   )}]]
   :hover-dark-green       [[[":hover" ":focus"] {:color (color :dark-green   )}]]
   :hover-green            [[[":hover" ":focus"] {:color (color :green        )}]]
   :hover-light-green      [[[":hover" ":focus"] {:color (color :light-green  )}]]
   :hover-navy             [[[":hover" ":focus"] {:color (color :navy         )}]]
   :hover-dark-blue        [[[":hover" ":focus"] {:color (color :dark-blue    )}]]
   :hover-blue             [[[":hover" ":focus"] {:color (color :blue         )}]]
   :hover-light-blue       [[[":hover" ":focus"] {:color (color :light-blue   )}]]
   :hover-lightest-blue    [[[":hover" ":focus"] {:color (color :lightest-blue)}]]
   :hover-washed-blue      [[[":hover" ":focus"] {:color (color :washed-blue  )}]]
   :hover-washed-green     [[[":hover" ":focus"] {:color (color :washed-green )}]]
   :hover-washed-yellow    [[[":hover" ":focus"] {:color (color :washed-yellow)}]]
   :hover-washed-red       [[[":hover" ":focus"] {:color (color :washed-red   )}]]
   :hover-bg-dark-red      [[[":hover" ":focus"] {:background-color (color :dark-red     )}]]
   :hover-bg-red           [[[":hover" ":focus"] {:background-color (color :red          )}]]
   :hover-bg-light-red     [[[":hover" ":focus"] {:background-color (color :light-red    )}]]
   :hover-bg-orange        [[[":hover" ":focus"] {:background-color (color :orange       )}]]
   :hover-bg-gold          [[[":hover" ":focus"] {:background-color (color :gold         )}]]
   :hover-bg-yellow        [[[":hover" ":focus"] {:background-color (color :yellow       )}]]
   :hover-bg-light-yellow  [[[":hover" ":focus"] {:background-color (color :light-yellow )}]]
   :hover-bg-purple        [[[":hover" ":focus"] {:background-color (color :purple       )}]]
   :hover-bg-light-purple  [[[":hover" ":focus"] {:background-color (color :light-purple )}]]
   :hover-bg-dark-pink     [[[":hover" ":focus"] {:background-color (color :dark-pink    )}]]
   :hover-bg-hot-pink      [[[":hover" ":focus"] {:background-color (color :hot-pink     )}]]
   :hover-bg-pink          [[[":hover" ":focus"] {:background-color (color :pink         )}]]
   :hover-bg-light-pink    [[[":hover" ":focus"] {:background-color (color :light-pink   )}]]
   :hover-bg-dark-green    [[[":hover" ":focus"] {:background-color (color :dark-green   )}]]
   :hover-bg-green         [[[":hover" ":focus"] {:background-color (color :green        )}]]
   :hover-bg-light-green   [[[":hover" ":focus"] {:background-color (color :light-green  )}]]
   :hover-bg-navy          [[[":hover" ":focus"] {:background-color (color :navy         )}]]
   :hover-bg-dark-blue     [[[":hover" ":focus"] {:background-color (color :dark-blue    )}]]
   :hover-bg-blue          [[[":hover" ":focus"] {:background-color (color :blue         )}]]
   :hover-bg-light-blue    [[[":hover" ":focus"] {:background-color (color :light-blue   )}]]
   :hover-bg-lightest-blue [[[":hover" ":focus"] {:background-color (color :lightest-blue)}]]
   :hover-bg-washed-blue   [[[":hover" ":focus"] {:background-color (color :washed-blue  )}]]
   :hover-bg-washed-green  [[[":hover" ":focus"] {:background-color (color :washed-green )}]]
   :hover-bg-washed-yellow [[[":hover" ":focus"] {:background-color (color :washed-yellow)}]]
   :hover-bg-washed-red    [[[":hover" ":focus"] {:background-color (color :washed-red   )}]]
   :hover-bg-inherit       {"background-color" (clojure.core/str "inherit")}})