(ns tachyon-garden.styles.border-color
  (:require
   [tachyon-garden.styles.color :refer [color]]))

(defn border-color [value]
  {:border-color (color value)})

(def styledefs
  {:b--black         {        :border-color (color :black) }
   :b--near-black    {   :border-color (color :near-black) }
   :b--dark-gray     {    :border-color (color :dark-gray) }
   :b--mid-gray      {     :border-color (color :mid-gray) }
   :b--gray          {         :border-color (color :gray) }
   :b--silver        {       :border-color (color :silver) }
   :b--light-silver  { :border-color (color :light-silver) }
   :b--moon-gray     {    :border-color (color :moon-gray) }
   :b--light-gray    {   :border-color (color :light-gray) }
   :b--near-white    {   :border-color (color :near-white) }
   :b--white         {        :border-color (color :white) }
   :b--white-90      {   :border-color (color :white-90) }
   :b--white-80      {   :border-color (color :white-80) }
   :b--white-70      {   :border-color (color :white-70) }
   :b--white-60      {   :border-color (color :white-60) }
   :b--white-50      {   :border-color (color :white-50) }
   :b--white-40      {   :border-color (color :white-40) }
   :b--white-30      {   :border-color (color :white-30) }
   :b--white-20      {   :border-color (color :white-20) }
   :b--white-10      {   :border-color (color :white-10) }
   :b--white-05      {   :border-color (color :white-05) }
   :b--white-025     {   :border-color (color :white-025) }
   :b--white-0125    {   :border-color (color :white-0125) }
   :b--black-90      {   :border-color (color :black-90) }
   :b--black-80      {   :border-color (color :black-80) }
   :b--black-70      {   :border-color (color :black-70) }
   :b--black-60      {   :border-color (color :black-60) }
   :b--black-50      {   :border-color (color :black-50) }
   :b--black-40      {   :border-color (color :black-40) }
   :b--black-30      {   :border-color (color :black-30) }
   :b--black-20      {   :border-color (color :black-20) }
   :b--black-10      {   :border-color (color :black-10) }
   :b--black-05      {   :border-color (color :black-05) }
   :b--black-025     {   :border-color (color :black-025) }
   :b--black-0125    {   :border-color (color :black-0125) }
   :b--dark-red      { :border-color (color :dark-red) }
   :b--red           { :border-color (color :red) }
   :b--light-red     { :border-color (color :light-red) }
   :b--orange        { :border-color (color :orange) }
   :b--gold          { :border-color (color :gold) }
   :b--yellow        { :border-color (color :yellow) }
   :b--light-yellow  { :border-color (color :light-yellow) }
   :b--purple        { :border-color (color :purple) }
   :b--light-purple  { :border-color (color :light-purple) }
   :b--dark-pink     { :border-color (color :dark-pink) }
   :b--hot-pink      { :border-color (color :hot-pink) }
   :b--pink          { :border-color (color :pink) }
   :b--light-pink    { :border-color (color :light-pink) }
   :b--dark-green    { :border-color (color :dark-green) }
   :b--green         { :border-color (color :green) }
   :b--light-green   { :border-color (color :light-green) }
   :b--navy          { :border-color (color :navy) }
   :b--dark-blue     { :border-color (color :dark-blue) }
   :b--blue          { :border-color (color :blue) }
   :b--light-blue    { :border-color (color :light-blue) }
   :b--lightest-blue { :border-color (color :lightest-blue) }
   :b--washed-blue   { :border-color (color :washed-blue) }
   :b--washed-green  { :border-color (color :washed-green) }
   :b--washed-yellow { :border-color (color :washed-yellow) }
   :b--washed-red    { :border-color (color :washed-red) }
   :b--transparent   { :border-color (color :transparent) }
   :b--inherit       { :border-color :inherit }})
