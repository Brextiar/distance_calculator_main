## La testabilité des méthodes pures

Les méthodes **pures** facilitent la **testabilité** parce qu'elles sont prévisibles et indépendantes : pour une même entrée, elles produisent toujours le même résultat, sans modifier l’état de l’application ou influencer d'autres parties du code. Cela permet de tester chaque méthode de manière isolée, sans se soucier des interactions ou des effets secondaires. En pratique, on peut vérifier les résultats de façon simple et fiable, sans avoir à recréer un contexte complexe ou gérer des états modifiés entre les tests. **Résultat** : les tests sont plus rapides à écrire, plus stables, et plus faciles à maintenir.

## Structure du code pour assurer la pureté des méthodes

En structurant mon code, j’ai résolu le problème de la **pureté des méthodes entre classes dépendantes** en m’assurant que chaque méthode reste **isolée** et **prédictible**. Par exemple, dans la classe `JourneyManager`, j’ai séparé les responsabilités :
- La méthode `calculate()` s’occupe du **calcul de distance** entre deux points.
- La méthode `totalDistance()` utilise `calculate` pour **additionner les distances** sans modifier d'état externe.

Par ailleurs, j’ai utilisé un `record` pour la classe `Point`, ce qui rend chaque point **immuable** et garantit que ses coordonnées ne peuvent pas être modifiées après sa création. Grâce à ces choix, chaque méthode reste **pure** et simple à tester, même lorsque les classes interagissent.
