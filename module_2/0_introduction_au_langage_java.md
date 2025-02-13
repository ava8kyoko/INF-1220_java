# Module 2. Introduction au langage Java. Le concept de programme. Les types, les fonctions, les méthodes, les variables. Les variables de classe et les variables locales.

- [Activité 2.1](https://inf1220-vw2.teluq.ca/module-2/activite-2-1/)
- [Activité 2.2](https://inf1220-vw2.teluq.ca/module-2/activite-2-2/)
- [Activité 2.3](https://inf1220-vw2.teluq.ca/module-2/activite-2-3/)
- [Exercices 2.1](https://inf1220-vw2.teluq.ca/module-2/exercices-2-1/)
- [Activité 2.4](https://inf1220-vw2.teluq.ca/module-2/activite-2-4/)
- [Exercices 2.2](https://inf1220-vw2.teluq.ca/module-2/exercices-2-2/)
- [Travail noté 2](https://inf1220-vw2.teluq.ca/module-2/travail-note-2/)

## Activite 2.2

```
Créer un fichier nommé Hello.java
avec ceci d'écrit à l'intérieur:

public class Hello {
    public static void main (String[] args) {
        System.out.println("Hello world!");
    }
}

Écrire dans le terminal les commandes suivantes:
javac Hello.java
java Hello      

Voici ce qui s'affiche dans le terminal:
Hello world!
```

Nous reviendrons dans le cours sur les éléments de programmation nécessaires pour comprendre ce programme. Néanmoins, en voici l’essentiel:

[Video explication programmation orientee-objet](https://www.youtube.com/watch?v=5j5z9BJCAW8)

![alt text](/module_2\img\explications_bienvenue.png)

#### Lectures et exercices :
- Java Pas a pas
    - Chapitre 2
    - Chapitre 4
- Delannoy 
    - Chapitre 1

## Activite 2.3

### Les variables et les types

Une variable permet de manipuler des données et des valeurs. Elle se caractérise par un nom et un type. Le nom sert à repérer un emplacement mémoire dans lequel la valeur de la variable sera stockée. Quant au type, il permet de déterminer la façon dont la valeur de la variable est traduite en code binaire, ainsi que la taille de son emplacement mémoire. Par exemple, le type « int » permet de stocker une valeur numérique de type entière (ex. 1, 3, 33, 56, etc.). Une variable peut également stocker en mémoire l’instance d’un objet, par exemple une chaîne de caractères avec une instance de la classe « String » (ex. String exemple = "Exemple";). Voici un exemple de déclaration et assignation d’une valeur à une variable dans une classe :

```
public class Exemple1 {

      public static void main (String[] args) {
      
          // Création d'une variable de type int
          int entier = 33;

         // Création d'une variable de type booléenne
         boolean test = false;

      }
}
```
Il est important d’utiliser les guillemets droits (ASCII)

"
pour délimiter les chaînes de caractères. Certains environnements (comme le site Web du cours INF 1220 ou Microsoft Word) peuvent parfois convertir automatiquement les guillemets droits en guillemets à la française (« »). En tant que programmeur, c’est à vous de faire la correction lorsque vous recopiez le code informatique.

#### Le nom des variables

Dans la déclaration des noms des variables, il est fortement conseillé d’utiliser des noms indicatifs. Il s’agit donc d’utiliser le nom qui évoque le mieux l’information stockée. Les contraintes suivantes sont à respecter dans l’écriture des noms de variables :

- Le premier caractère d’une variable ne doit pas être un chiffre.
- Aucun espace ne peut être présent dans le nom.
- Un nom de variable qui contient une lettre majuscule est différent du même nom écrit en minuscule.
- Les caractères suivants : &, {, }, [, ], #, %, \, ï, ¤, !, /, @,^, =, ‘, <, >, ; et , ne peuvent être utilisés dans l’écriture d’un nom de variable. Il est possible d’utiliser des caractères accentués (éù) ou même des caractères asiatiques or arabes.
- La norme de programmation veut que l’on commence une variable par une minuscule. S’il est nécessaire de décrire celle-ci avec plusieurs mots, nous vous suggérer d’utiliser une transition minuscule-majuscule pour séparer les mots. Exemple : « uneAutreVariable », « entierResultatMultiplication », etc.

Le nombre de lettres composant le nom d’une variable est indéfini. Néanmoins, l’objectif principal d’un nom de variable est de renseigner le programmeur sur son contenu.

#### La notion de type

Lors de l’écriture d’un programme, le programmeur doit définir les variables. C’est ainsi que le programmeur explique à l’ordinateur la nature de chaque donnée. Cette explication passe par la notion de type. Le type d’une valeur permet de déterminer la nature de l’information stockée dans une variable. À chaque type sont associés les éléments suivants :

- Un code spécifique permettant de traduire l’information en binaire et réciproquement.
- Un ensemble d’opérations réalisables en fonction du type de variable utilisé; il est possible de diviser deux variables du type numérique alors qu’il est impossible de diviser deux variables de type caractère.
- Un intervalle de valeurs possibles qui dépendent du codage utilisé. Donc, à chaque type de variable correspond un nombre d’octets, et par conséquent, un nombre limité de valeurs différentes.

En effet, un octet est un regroupement de 8 bits, et un bit ne peut être qu’un 0 ou un 1. Une donnée codée sur un octet peut prendre 256 valeurs.

Les types de base en Java

Comme la plupart des langages de programmation, Java propose des types de base permettant la manipulation de valeurs numériques entières ou de caractères. En principe, comme le Java est un langage OO, tous les éléments devraient être des objets (ex. String, Serializer, HashMap, etc.). Or, à la création du langage, les concepteurs ont décidé de créer des types « non-objet » afin de faciliter l’usage et réduire la complexité pour les types de base. Ces types sont donc représentés par des mots-clés, prédéfinis par le langage. Ils sont également dits simples, car à un instant donné, ces types de variables ne peuvent contenir qu’une seule valeur. Le tableau ci-dessous représente les différents types en Java.

![alt text](/module_2\img\TypeEnJava.png)

N.B. Les chaînes de caractères ne correspondent pas à un type de données mais à une classe; ceci signifie qu’une chaîne de caractère est un objet possédant des attributs et des méthodes. Une chaîne peut donc être déclarée de la façon suivante :

String s = "Chaîne de caractères";
Dans ce cours, il n’est pas nécessaire de devenir un expert dans les types du Java. Vous devez tout de même avoir les bases:

1. Il y a plusieurs types pour représenter les entiers (byte, short, int, long) utilisant une quantité variable de mémoire, et pouvant représenter des nombres plus ou moins volumineux. À l’exception du type « char » qui peut être considéré comme un type représentant des entiers (de 0 à 65536), les types entiers en Java sont toujours signés (ils permettent de représenter à la fois les nombres positifs et négatifs). Notez qu’il y a toujours une valeur négative de plus grande amplitude que n’importe quelle valeur positive (par exemple, -128, -32768, -2147483648, etc.) ce qui signifie qu’on ne peut toujours prendre la valeur absolue d’un entier en Java dans le sens où, par exemple, la valeur 2147483648 ne peut pas être représentée par un « int » alors que -2147483648 est parfaitement légitime.
2. Les types entiers n’ont qu’une seule valeur zéro. Les nombres à virgule flottantes ont deux zéros (-0 et +0). Nous avons que les valeurs zéros sont égales (+0 == -0). Par contre, les deux zéros sont distincts: 1/-0 donne l’infini négatif (1/-0.0 == Double.NEGATIVE_INFINITY) alors que 1/+0 donne l’infini positif (1/0.0 == Double.POSITIF_INFINITY).
3. En informatique, on définit l’ensemble des nombres positifs comme étant les nombres plus grands que zéro. Les nombres négatifs sont les nombres plus petits que zéro. En Java, la fonction Math.signum retourne -1, 0 ou 1 selon que le nombre est négatif, nul ou positif.
4. En Java, on ne peut pas représenter les valeurs réelles. On utilise plutôt des nombres à virgule flottante. Ainsi donc, on peut utiliser des « double » pour consacrer 64 bits afin de représenter des nombres. On utilise alors la norme « binary64 » qui accorde 53 bits à la mantisse d’une représentation binaire. En d’autres mots, on peut pratiquement représenter n’importe quel nombre de la forme m x 2p tant que m n’excède pas 253. En particulier, le type « double » en Java peut représenter tous les entiers (positifs et négatifs) qui n’excèdent pas une magnitude de 253. Quand un nombre ne peut pas être être représenté, Java va trouver le nombre à virgule flottante le plus proche. Si jamais nous arrivons exactement entre deux nombres à virgule flottante, comme c’est le cas avec le nombre 9000000000000002.5, Java va choisir le nombre le plus proche qui a une mantisse paire (ici 9000000000000002).

Les types ont des limites qu’il faut connaître. En 2021, on pouvait lire ceci dans les journaux:

Le cours de l’action Berkshire Hathaway Inc de Warren Buffett est passé à plus de 400 000 $ par action de catégorie A. Mais l’impressionnante course de 41 ans de l’action pourrait bientôt s’arrêter brutalement si la bourse américaine Nasdaq ne met pas à niveau ses systèmes informatiques bientôt, a rapporté le Wall Street Journal. La raison en est que le cours de l’action Berkshire Hathaway est très proche du nombre le plus élevé que les ordinateurs du Nasdaq peuvent gérer. Le Nasdaq et quelques autres opérateurs du marché utilisent des systèmes 32 bits pour stocker les données en nombres binaires, qui comprennent des uns et des zéros. Par conséquent, le plus grand nombre possible est de deux à la 32e puissance moins un, soit 4 294 967 295. Les cours des actions sont généralement affichés jusqu’à quatre décimales, de sorte que le prix le plus élevé possible est de 429 496,7295 $, selon le rapport du WSJ.

Lecture: [Article : Virgule flottante](https://fr.wikipedia.org/wiki/Virgule_flottante) sur Wikipedia.

Lecture dans le livre de référence
Pour aller plus en profondeur sur les types. Veuillez lire dans Programmer en Java de Claude Delannoy, Chapitre 3:

- Section 1 : La notion de type
- Section 2 : Les types Entier
- Section 3 : Les types flottants
- Section 4 : Le type caractère
- Section 5 : Le type booléen

Video suggerees:
- [Les variables](https://www.youtube.com/watch?v=SvPGiy5UXRI)
- [Standard IEEE 754 des nombres a virgule flottante](https://www.youtube.com/watch?v=mtizhxkB-Zw)


![alt text](image.png)

notation : 1_000_000_000_000

bases numeriques :  
- decimale    (10 -> 0 - 9)
- binaire     (2  -> 0 - 1) 0**b**11001111
- octale      (8  -> 0 - 7) **0**755
- hexadecimal (16 -> 0 - F) **0x**AF55

![alt text](/module_2\img\operateurs_affectation.png)

![alt text](/module_2\img\operateurs_arithmetiques_2_operandes.png)

![alt text](/module_2\img\operateurs_arithmetiques_1_operande.png)

![alt text](/module_2\img\operateurs_relationnels.png)

![alt text](/module_2\img\operateurs_logiques.png)

L’évaluation des expressions logiques est arrêtée dès lors que le résultat est déterminé. L’évaluation partielle optimise le code, mais peut avoir des effets indésirables. Il est possible de forcer l’évaluation en utilisant, entre autres, les opérateurs d’arithmétique binaire.

![alt text](/module_2\img\operateurs_arithmetiques_binaire.png)

![alt text](/module_2\img\operateur_3_operandes.png)

![alt text](/module_2\img\operateur_concatenation.png)

![alt text](/module_2\img\priorite_operateurs1.png)

![alt text](/module_2\img\priorite_operateurs2.png)

Textes a lire :
- [Synthèse sur les opérateurs Java](https://koor.fr/Java/Tutorial/JavaOperators.wp)
- [Java Arithmetic Operators with Examples](https://www.geeksforgeeks.org/java-arithmetic-operators-with-examples/)
- [The Arithmetic Operators (+, -, *, /, %)](https://riptutorial.com/java/example/678/the-arithmetic-operators--plus-------------)
- [Permutation](https://fr.wikipedia.org/wiki/Permutation_(informatique)#En_utilisant_l%27op%C3%A9ration_XOR)

## La conception de méthodes/fonctions et leur appel.

Cette vidéo donne une bonne vue d’ensemble de la programmation orientée-objet en Java:
[https://www.youtube.com/watch?v=h1qQf1oETXs](https://www.youtube.com/watch?v=h1qQf1oETXs)

### La définition d’une méthode/fonction simple
Une méthode est une suite d’instructions englobées dans un bloc {} permettant de réaliser une opération donnée. De façon générale, la syntaxe d’une méthode est la suivante :

```
 public static typeretourné nomdelafonction(la liste des paramètres){
        //instructions 
  }
```

Vous trouverez ci-dessous la description de la définition de la méthode précédente :

public : tout programme Java a accès à cette fonction. Nous verrons plus loin d’autres types d’accès (protected, private).

static : indique que la fonction que nous avons définie est statique, c’est-à-dire qu’elle peut être appelée sans la création d’une instance de la classe dans laquelle elle est définie. Si le mot-clé static n’est pas utilisé, alors il faut créer une instance de la classe où la méthode est définie. À ce moment, la méthode sera appelée pour l’instance de la classe spécifique. Pour pouvoir appeler une fonction qui n’est pas static, il faut absolument disposer d’une instance de la classe. Une fonction qui est static peut être appelée sans instance de la classe.

typeretourné : c’est le type de la variable retournée par la fonction. Si la fonction ne retourne rien, il faut utiliser le mot clé void.

nomdelafonction : Il faut choisir un nom assez explicite pour la fonction. Il faut également uniformiser la nomenclature des fonctions dans tout le programme afin d’en faciliter le débogage. Il est recommandé d’utiliser la convention mixed-Case, selon laquelle il est recommandé d’écrire le premier mot complètement en minuscule. Il existe plusieurs conventions et recommandations pour la nomenclature des différents éléments d’un programme, voici celle de l’entreprise Google pour le langage Java https://google.github.io/styleguide/javaguide.html#s5-naming

la liste des paramètres : La liste peut contenir plusieurs paramètres. Elle permet à Java de savoir quels types de paramètres sont reçus par la fonction, de même que leur nom. Alors, les instructions reçues par la fonction pourront utiliser ces paramètres comme des variables locales. Par contre, si la fonction n’accepte pas de paramètres, elle est définie ainsi :

```
public static typeretourné nomDeLaFonction(){
        //instructions 
 }
 ```

 #### Videos
 - [Construction d'une classe](https://www.youtube.com/watch?v=IZ8wKErw0_Y)
 - [Attributs](https://www.youtube.com/watch?v=48wGbUfFtfM)
 - [Methodes](https://www.youtube.com/watch?v=FkB7N0w81Dk)
 - [Encapsulation donnees](https://www.youtube.com/watch?v=zM_Qf07fEyc&t=1s)