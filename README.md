# tachyon-garden
### Tachyons framework re-implemented in Garden CSS
** Tachyon Garden** is a CSS framework, heavily based on [Tachyons](https://tachyons.io)

## Rationale:
Tachyons is a great way to quickly prototype and get decent looking MVP running. 
However, the resulting component's code become coupled with the framework's class semantic, and it often leads to the situation where you have to wrestle against the framework when it comes to implementing customized styles ontop of it. So adopting any existing CSS framework at early stages of the project creates a substantial technical debt.

What this library is trying to achieve is to keep styles manageble on further customization, and make your code framework-independent while making use on it's benefits.
It follows these 3 principles to make it possible:
 1. Using semantic, domain-specific HTML (and semantic classes) instead of framework's shortcuts
 2. Maintaining Code/Style separation. Keeping styles in a separate layer, so they don't clog code readability.
 3. Styles are data too. Being able to use handle styles with full power of Clojure let you do it your way. There is just no need in additional CSS preprocessors and their syntaxes, unnecessary multiplying entites.

## Examples:
Instead of defining your styles directly in the code layer, like
```clj
[:a.f6.link.dim.ph3.pv2.mb2.dib.white.bg-dark-pink "Save"]
```
with the library, you could define metaclass
```clj
(defstyles forms
  [:.save-button 
    (f6) (link) (dim) (ph3) (pv2) (mb2) (dib) (white) (bg-dark-pink)]
  [:.cancel-button 
    (f6) (link) (dim) (ph3) (pv2) (mb2) (dib) (white) (bg-dark-gray)])
```

and then use it in your HTML
```clj
[:.save-button "Save"]
```
