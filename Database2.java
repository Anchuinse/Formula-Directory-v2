import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Matt on 10/22/17.
 */
public class Database2
{
    ArrayList<Formula2> formulae = new ArrayList<Formula2>();
    ArrayList<String> keywords = new ArrayList<String>();

    public Database2()
    {
        initializeFormulae();
        sortFormulas();
        initializeKeywords();
    }

    public ArrayList<Formula2> getFormulae()
    {
        return formulae;
    }

    public ArrayList<String> getKeywords()
    {
        return keywords;
    }

    public ArrayList<String> getAlphabet() {
        ArrayList alphabet = new ArrayList();
        alphabet.add("A");
        alphabet.add("B");
        alphabet.add("C");
        alphabet.add("D");
        alphabet.add("E");
        alphabet.add("F");
        alphabet.add("G");
        alphabet.add("H");
        alphabet.add("I");
        alphabet.add("J");
        alphabet.add("K");
        alphabet.add("L");
        alphabet.add("M");
        alphabet.add("N");
        alphabet.add("O");
        alphabet.add("P");
        alphabet.add("Q");
        alphabet.add("R");
        alphabet.add("S");
        alphabet.add("T");
        alphabet.add("U");
        alphabet.add("V");
        alphabet.add("W");
        alphabet.add("X");
        alphabet.add("Y");
        alphabet.add("Z");
        return alphabet;
    }

    private void sortFormulas()
    {
        Collections.sort(formulae);
    }

    private void initializeFormulae()                               //contains information on all Formulae
    {
        formulae.add(new Formula2("Tag", "B1307", 7,2,5,4,4, "Formula B1307 powers always creates a power that is applied with physical contact to the target. " +
                "The first step of the power involves tagging the target and then the second involves manipulating the targets in some way. The manifested powers tend toward a utility, although directly defensive " +
                "and offensive are also likely. Common deviations include desire to avoid touching objects, even in powers where involuntary discharge would be harmless or a seemingly tertiary power that leaves " +
                "glowing handprints everywhere. Worrisome deviations rare.", "short-range, utility, common, versatile"));
        formulae.add(new Formula2("Peregrine","Y2001",10,1,2,1,3,"Formula Y2001 grants personal flight in nearly every case. The flight is usually accompanied by a cosmetic effect, " +
                "either a sound, sight, or etc. that has no practical effect. The only known deviation [Y2001-014] developed feathered wings. These wings also seemed cosmetic and had no obvious role in flight. Slowest " +
                "flight time recorded from a Y2001 patient was 83km/hr.", "flight, safe, reliable, movement, self"));
        formulae.add(new Formula2("Undertake","P8605",4,7,5,1,5,"The overarching theme of sample P8605 seems to be creating a fixation (in self or in others) on a given problem " +
                "until it is solved. Powers included a villian that caused targets to become preocuppied with cleaning an area (P8605-002), a patient who could force others to become single-mindedly focused on any problem for " +
                "hours (P8605-051), and a patient with advanced problem-solving who could not stop until a solution was found (P8605-004). P8605-051 had a strong enough influence to accidentally force a test subject " +
                "to break their own arm when tasked to lick their elbow. Ironically, the only common deviation is a spacey lack of focus when not solving problems.","mental, solution, master, temporary"));
        formulae.add(new Formula2("Bulwark", "D4234",5,4,8,3,6,"Sample D4324 seems to always grant a power that can 'grow' matter out of other matter of the same kind. " +
                "Although several patients displayed the ability to grow matter from hundreds of locations at once, the large majority of patients could only target one or two locations at a time. However, it was quite " +
                "common for patients to be able to pull walls into existence that stood 10*10*5 feet in twenty seconds or less. The most common forms of matter were sturdy solids, although softer solids and even organic plant " +
                "matter (D4234-008) have been observed. It was rare, but a few patients created liquid matter instead of solid matter. D4234 is good for those customers that want to have a lasting effect on the battlefield. "
                ,"creation, powerful, utility, inorganic, permanent"));
        formulae.add(new Formula2("Spectre", "G7160",5,8,4,0,5,"Patients given sample G7160 all developed a form of avoidance aura that made them harder, or nearly impossible to detect. " +
                "Some made others unconsciously avoid looking at them or be in their vicinity while the more potent auras made others completely unaware of the patient. Subjects reported symptoms indicative of schotoma involving " +
                "the patient. Several patients developed a modified version of these auras that worked primarily on machines, causing static or corrupted footage files. No known deviations besides one possible case (G7160-087). " +
                "After imbibing, patient disappeared and could no longer be detected. Unknown whether this was a deviation or a very powerful power that also bypassed the Manton limit. An accurate power rating is nearly impossible " +
                "for G7160. Powers range from barely perceptible to incredibly exploitable. Patients will be closely monitored in case countermeasures need to be deployed.","safe, stealth, aura, unique, other"));
        formulae.add(new Formula2("Granule","H0104",8,8,7,6,6,"Sample H0104 represents one of the most consistent formulas for obtaining a reliable Changer ability. Every patient developed " +
                "an alternate form that consisted of a nebulus cloud of particulate matter. The exact type of matter is variable between patients. The most common deviations involve the patient's body leaking their associated element " +
                "which then orbits until they shift into the nebulus and back to collect the leaked matter. Every patient showed the ability to rotate the nebulus at high speeds to 'sand blast' targets. One notable outlier is H0104-212, " +
                "212 could create, among other things, a grenade that turned all inorganic matter to dust.","unique, changer, reliable, elemental"));
        formulae.add(new Formula2("Vanguard", "A5525",9,2,5,2,4,"Sample A5525 has only ever provided personal effects. These usually manifest as physical transformations, but in rare cases patients " +
                "have developed personal forcefields, with the most extreme example only extending twenty inches from the patients fingers (A5525-012). Physical changes can include regeneration, claws, tails, and stone skin (A5525-001). " +
                "However, most durability granted usually does not manifest in a change. It is primarily seen as a normal individual who, for example, cannot be cut (A5525-083). The only true non-durable subject was a Tinker (A5525-161) " +
                "who specialized in biological durability and regeneration. A5525-161 created a serum that allowed a dog to sustain a land mine blast without apparent injury.","self, durability, safe, common"));
        formulae.add(new Formula2("Igneous","J3257", 6,6,8,4,7, "Sample J3257 is optimal for any customer who idolizes volcanoes. It can provide a vast array of powers, all involving a " +
                "common ability to generate lava. Examples: toggled aura that heated rock to magma (J3257-013), pools of lava used as portals (J3257-105), a lava golem Changer (J3257-009), animate lava vipers (J3257-104), lava skin (J3257-007). " +
                "Most patients possess a secondary immunity to the heat, some even enjoying it. Other predictable outcomes included glowing eyes, and craig-like " +"fissures in the patient's skin (both temporary and active when using powers). " +
                "Any major deviations were almost always lethal, including a subject that vomitted lava, but who's throat had no protection from the heat (J3257-005). Subject was terminated for their own wellbeing " +
                "before futher tests could be conducted.", "elemental, fire, powerful, AoE, mid-range"));
        formulae.add(new Formula2("Fragrant", "M0982", 4,10,2,4,2, "Sample M0982 imbues the patient with some form of control over hormones and pheromones. Resulting powers are always very original " +
                "and many have humorous effects. Good for those customers that want to be a parahuman, but who don't want to be pressured to join the cape scene. Battle applications traditionally remain limited. Notable exceptions include a " +
                "perfume Tinker and a Striker who could cause muscle paralysis and intoxication respectively (M0982-006)(M0982-030). Mental deviations are more common, especially a lack of protection from personal pheromones.",
                "organic, AoE, unique, cheap, utility"));
        formulae.add(new Formula2("Layer","K4613", 1,4,5,2,3, "Sample K4613 exhibits a unique array of powers that it grants patients. Almost all varieties have been observed, elemental powers " +
                "as often as those that manipulate the laws of physics or the behavior of others. Every power has the unique property that, to reach its full potential, must be applied several times over. Many patients develop seemingly " +
                "trivial powers that, with enough time for preparation, end up rivalling any competent cape. Some K4613 powers had lasting effects and could be layered over time while others had to be stacked all at once before " +
                "releasing the power. Deviations are as varied as the powers given. Tinker powers are quite common, with the same trend of layering effects.", "safe, variable, tinker, utility"));
        formulae.add(new Formula2("Jaunt","F1976", 8,3,5,1,4, "Sample F1976 is so named as it grants a teleportation or portal Mover power. Most patients had relatively short range limits, " +
                "the largest topping out around 300m. Basic, line of sight teleportation is a commonly granted power, but many patients have unique 'flavours' of powers. The more interesting examples include a teleporter who slowed time " +
                "around their exit point (F1976-005) and a portal maker that turned all vertical surfaces in an area into portals with random destinations (F1976-109). F1976 is perfect for those customers that are looking to exhibit a " +
                "'trickster' motif in their costumed behavior. Subjects often aided the fight by repositioning their allies out of danger and into more advantageous positions. When solo, subjects had to exhibit ingenuity to take down more " +
                "durable foes. The one weakness shared by 95% of F1976 were powers that affected areas larger than their maximum range.", "teleportation, movement, safe, reliable, short-range, mid-range, utility"));
        formulae.add(new Formula2("Deus","T8120", 9,6,6,2,6, "Sample T8120 is perfect for capes who wish to participate in combat indirectly. It provides, with 100% accuracy, a Master-type projection " +
                "power, essentially creating a puppet for the patient to control. The only significant deviations observed involved mental changes; no significant physical deviations were obeserved. Some projections were merely illusions while " +
                "others were incredibly durable. A few projections even demonstrated abilities of their own, one of the more powerful being one that detonated upon destruction, creating a sphere of a jelly-like solid (D8120-301). Subject D8120-035, " +
                "for example, was an introverted, docile man. When projecting his construct, a sixty foot lion, he became aggressive and violent. Subject terminated after threatening to reveal us to authorities unless we permanently boosted his powers " +
                "(a currently impossible feat).", "creation, master, safe, reliable, singular"));
        formulae.add(new Formula2("Prince", "T7895", 3,7,5,1,5, "Sample T7895 toes the line between Shaker and Master for almost all subjects. The large majority of subjects gained the ability to manifest " +
                "one or two 'minions' although some required direct, conscious control while others required only general direction. Arguably these are Master-type abilities (ex. a pair of shadow cats [T7895-120]), but it is difficult to see how " +
                "manipulating a crystal spear (T7895-095) or a small sun (T7895-013) classifies as anything except Blaster and Shaker, respectively. Secondary Mover ratings from riding the manifestation can be excepted in cases where manifestations are " +
                "solid enough to support the patient. Customers looking for a puppeteer theme should definitely consider T7895. It may not provide a puppet in the traditional sense, but it will guarantee the general theme will be adhered to, albeit with a " +
                "secondary theme as well.","master, AoE, safe, creation"));
        formulae.add(new Formula2("Rime","J2105", 8,5,7,3,6, "Sample J2105 grants powers that tend to drastically lower temperature and/or inertia in an area, usually in close proximity to the subject. " +
                "Some auras extend several hundred feet while other powers only effect the subject's own body. A few subjects demonstrated the ability to blast a large area not centered on them, usually as a cone or grenade, for a similar effect. " +
                "Minor deviations usually involve perpetually cold skin, constant cloudy breath, or a frosting of the subject's eyes. In essence, J2105 is the prime formula for those customers looking to make a name for themselves as a frost-themed cape. " +
                "Customers should be noted that civilian life may need to be altered slightly to deal with any minor deviations that may manifest. Customers should also not that J2105 subjects are required to keep track of their allies in combat situations " +
                "to avoid accidentally injuring them.", "reliable, AoE, ice, temperature, kinetic, elemental"));
        formulae.add(new Formula2("Pinnacle","Q9768", 8,3,4,2,4, "Although the Q-series of formulas are grouped as commonly producing Tinker powers, sample Q9768 is the only formula to only produce Tinkers. Sample Q9768 tends " +
                "to produce Tinkers with specializations focused around optimizing technology. Known examples include miniaturization, durable machinery, regenerating machines, and machines with near-limitless redundancies. Q9768 Tinkers can be just as useful in corporate and " +
                "industrial/economic settings as they are in combat situations. As Tinker powers only affect the brain, only mental deviations have been observed. A notable subject developed a disgust with any non-Tinker tech and refused to use 'lesser' technology. " +
                "Even some rough-looking Tinker tech was not 'up to standard' (Q9768-052).","technology, tinker, safe, reliably, common, utility, versatile"));
        formulae.add(new Formula2("Lodestone","Q2207", 3,8,7,1,6,"Continuing the Q-series pattern of creating Tinkers, sample Q2207 grants Tinker powers involving attraction fields, barriers, and other area of effect, " +
                "zone-type effects. Around half of patients instead developed non-Tinker powers with the same general base of zone-type powers, lending them toward a Shaker classification. The granted powers can be as specific as an attraction field that draws in " +
                "bacteria (Q2207-006) or as general as a forcefield sphere that prevents everything from crossing the edge (Q2207-105). Q2207 powers are often the deciding factors in conflicts when paired with one or more complimentary parahumans.",
                "AoE, tinker, mid-range, utility, unique, safe"));
        formulae.add(new Formula2("Minutia", "U1085", 2,7,5,3,4, "Sample U1085 grants control of one or more objects, never bigger than 10cm. The shape and material of the manipulated objects varies from person to person; " +
                "exotic materials are seen almost as often as common materials and energy types. Some patients only control one object while others control thousands. Some create their own objects, others must find them. Customers should not assume controlling small " +
                "objects means they have a small effect; many of our U1085 customers have gone on to attain notable positions within the PRT. Ratings resulting from U1085 can be just as the powers themselves: Brute 3 protected by forcefields (U1085-008) up to Shaker 9 " +
                "who controls gravity-point orbs (U1085-113).","variable, telekinesis, versatile, environment"));
        formulae.add(new Formula2("Matrix","P4412", 4,1,7,2,5, "Sample P4412 chiefly grants Thinker powers that deal with massive amounts of data. It is common for granted powers to be quite taxing, but they are also, " +
                "very commonly, powerful. The mass of data can be complex, like ranking six possible answers to a question in order of 'correctness' (P4412-077) or simple, like the names and locations of every person around the patient (P4412-093). In some instances " +
                "subjects will have a second classification because of the nature of information they are recieving. P4412-093 is a good example of this, gaining a sub-classification of Stranger 2 as they could avoid trained guards that were looking for them. Mental " +
                "deviations often tend toward anxiety and mania involving visual hallucinations. ","unique, safe, mental, solution, utility, sensory, self"));
        formulae.add(new Formula2("Jealousy","S0111",8,7,5,0,6,"Sample S0111 almost always grants Trump-class powers that deal with copying other parahumans' powers. No serious deviations have been noted. The powers are " +
                "sometimes copied to others, sometimes to the subject and some subjects copy the power(s) in full while other patients copy the powers in a weakened or altered state. Those rare examples of non-copying powers place severe restrictions on the powers of others. " +
                "No S0111 subjects have demonstrated the Trump ability to buff the powers of others. To fully utilize a S0111 power, customers must be adaptable to every situation. It requires an intelligent, fast-learning individual to take advantage of every facet of " +
                "the powers the subject copies.", "power-affecting, reliable, safe, versatile"));
        formulae.add(new Formula2("Observance","K5082", 2,9,9,1,8, "Sample AK5082 reliably grants powerful abilities in the top tier of their given categories, and was created by mixing several volatile test formulas with " +
                "balancing agents. Interestingly, all powers granted by sample K5082 seem to be either only active while being observed, or they only work when not observed. It appears all powers activate automatically and cannot be switched off by the users. " +
                "Full implementation of K5082 formulas will likely require organized coordination with other team members. Every power classification, to varying degrees, has been demonstrated from K5082. Powers that only work when not observed were more likely to be Mover or Stranger " +
                "while those that only work while observed were more likely to be Brute, Shaker, or Master.","variable, unique, powerful, safe, expensive"));
        formulae.add(new Formula2("Medley","K1882", 3,2,3,0,3, "Sample K1882 was created by mixing many stable, but mostly inert, test formulas. This sample always produces the equivalent of a grab-bag parahuman. These " +
                "parahumans often have 3 or more unique powers, but each individual power is relatively weak. The number of powers and the nature of each power varies from patient to patient, although most powers would not rate higher than a 2 or 3 on the PRT scale. " +
                "This lack of raw power should not dissuade customers. This formula is perfect for customers looking to have several options at any given time. Customers should also note that although each power may have a relatively low rating, uniquely combining " +
                "each power can often raise a parahuman's rating by 2 or more.","grab-bag, variable, safe, cheap, common, power-affecting, versatile"));
        formulae.add(new Formula2("Homunculus","T3758", 7,7,4,4,3, "Sample T3758 is great for any customer that is in need of a constant companion. In every case, the subject develops the ability to create one or more sentient or " +
                "semi-sentient beings from inorganic matter (taking around one minute of focus). These homunculi, as we have termed them, have been shown to be anywhere from 10cm to 30m in length and have wildly varying personalities. Each homunculi was unique in its features, " +
                "and some even exhibited powers of their own, and, although it was rare, the subject sometimes also developed a weaker version of their homunculi's power. More commonly, while the subject and homunculi were in close proximity the homunculi was empowered. " +
                "Deviations from T3758 were often dramatic and physical, with subjects' bodies taking on a grotesque, gargoyle-like facade. An interesting oddity was subject T3758-230 who's power was to combine their own body with technology to become a cyborg. It was " +
                "thought this was the first non-homunculi power, until it was discovered that the technological parts had their own sentience. No matter the homunculi's personality, it should be noted that they work with their creators and follow their orders. The only " +
                "contrary examples are when the patient orders their homunculi to do something the homunculi believes will result in the death of their master. Homunculi that are destroyed seem to retain the memories from before their destruction and, although " +
                "they describe death as painful, will happily complete suicidal actions if it furthers their creator's goals.","cheap, creation, master"));
        formulae.add(new Formula2("Persona","G0100", 3,8,7,2,6, "Sample G0100 is named such as it deals with creating or modifying the appearance of one or more humans. There have been Changers capable of copying the appearance of " +
                "anyone they come in contact with as commonly as there have been patients that created mirages of random people in the vicinity (G0100-130). The vast majority of power effects are temporary, but a select few are permanent. One of the most 'traumatic' permanent " +
                "powers was an individual (G0100-018) who possessed the ability to switch appearances with another. This formula's deviation have an interesting facet of not making the subject 'abnormal'. The most common deviation is changing the subject's appearance to that " +
                "of another human. This doesn't make civilian life impossible, but it does make forged documentation essential in those cases where deviations are present. It also requires explaining to family members, if the relationship is wished to continue, that the subject " +
                "triggered (must create a realistic trigger event).","temporary, unique, variable, safe, stealth"));
        formulae.add(new Formula2("Wonderland","W5040", 2,8,5,2,4, "Time, gravity, and dimensional distortion powers are often sought-after, but W5040 puts an interesting " +
                "spin on them. They often provide bizarre, seemingly nonsensical powers with no clear use ingrained. Fans of Lewis Carroll's Alice in Wonderland will enjoy the unique powers provided by W5040. Even though " +
                "each power may seem to be useless in combat, W5040 powers tend to have one or more caveats that make them useful, in a roundabout sort of way. A good example is W5040-101 who was granted a space warping " +
                "ability. They described the experience as the world 'bending around like silly putty' and they could float between parts that bent close to each other. While 'floating' between places, they disappeared " +
                "from reality as we know it. They could even take a volunteer with them by holding their hand, although video feeds failed to work within and volunteers became incredibly anxious when asked to describe " +
                "their experiences within. The act of traveling in this dimension often made W5040-101 appear and disappear intermitently around the battlefield.","variable, unique, safe, exotic, versatile, utility, " +
                "time, gravity, dimensional, movement, whimsical"));
        formulae.add(new Formula2("FOREIGN ELEMENT A", "Z9999", 0,10,10,10,10,"DATA FILE CORRUPTED","variable, powerful, deviant, unique, expensive, utility"));
        formulae.add(new Formula2("FOREIGN ELEMENT B", "Z9998", 0,10,10,10,10,"DATA FILE CORRUPTED", "variable, powerful, deviant, unique, expensive, lethal"));
        formulae.add(new Formula2("FOREIGN ELEMENT C", "Z9997",0,10,10,10,10,"DATA FILE CORRUPTED","variable, powerful, deviant, unique, expensive, defensive"));
        formulae.add(new Formula2("Sanguine","V1313", 3,8,6,5,5, "As its name would suggest, V1313 powers deal exclusively with blood. Although primarily human blood, " +
                "there were subjects that had powers that could either use animal blood just as well as human blood, or even a rare few that worked exclusively with animal blood. Subject V1313-026 could soak her hands " +
                "in fresh animal blood to see everything it had ever seen, but it did not work with humans. Preliminary tests show that she can at least splotches of light and dark if she soaked her hands in tree sap. " +
                "This suggests that the formula doesn't deal so much with blood specifically as it does with the life essence or something similar in each organism. Precognitive abilities tend to involve large amounts of " +
                "fresh blood of the target, while other uses tend to deal with the subject's blood or others' blood equally. While the painless trait is rarely expressed in V1313 subjects, a regenerative factor is a common " +
                "that counteracts the amount of blood lost by those that must utilize their own blood in combat.", "unique, terrifying, regeneration, organic"));
        formulae.add(new Formula2("Jolt", "J1191", 6,5,6,3,5, "The classic electrical element formula, J1191 provides bursting, electrical powers. Many of subjects exhibit the " +
                "instant electrical attacks that are stereotypical of many staple electric capes. The few exceptions provide long, continuous currents of electricity that can often disable some of the toughest Brute villains " +
                "on record. It is advised that customers with these powers educate themselves about electricity as there have been several cases where former customers and subjects accidentally killed themselves or others. " +
                "These accidents ranged from a patient not accounting for the metal platforms inside a factory to a different patient attempting to revive an ally by trying to mimic an AED, they misjudged the voltage and current; their " +
                "former allies were almost unrecognizable. Major deviations can require subjects to avoid technology without specially made gear. This is due to most deviations involving, at least in part, a periodic, " +
                "massive discharge of energy that destroys most electronics.", "electricity, elemental"));
        formulae.add(new Formula2("Whimsy", "W3571", 3,9,5,3,4, "W3571 is not the formula to purchase if a customer is looking for a specific classification or type of power. " +
                "It is, however, a perfect formula for team theming. Every power deals with an exotic, alien world we have termed Planet 571. It seems the planet is in a perpetual state of twilight with the primary colors " +
                "of it's inhabitants being differing hues of blue, green, and purple. The planet's atmosphere has a composition similar to that of Earth and its inhabitants are only slightly more dangerous. The predatory " +
                "animals are adapted to hunting at night and a significant set of patients develop Changer or Brute powers involving these animal's biology. The plants are more densely packed and draw much of their nutrients " +
                "from the air. Several large, carnivorous species of plants exist while many others ensnare animals or possess large spines to deter herbivores. Shakers that create copies of these plants and powers that employ " +
                "dimensional abilities to and from this planet make up the majority of the other powers. If an entire team of customers imbibes W3571, no matter the powers given, they will all coalesce into a beautiful, bizarre " +
                "theme.", "unique, variable, whimsical, organic, exotic, dimensional, complex"));
        formulae.add(new Formula2("Tireless", "Y3824", 9,3,1,0,2, "Another one of our recreational formulas, Y3824 provides a power that is more useful than fun. Anyone who imbibes " +
                "Y3824 will never have to sleep again. Some can sleep, but just do not have to, while others find it physically/mentally impossible to fall asleep. Y3824 has a 9 in Reliability only because some subjects also " +
                "developed a lack of need for water and food as well, among other, more minor, necessities. Two subjects also displayed a reduced need to breathe. In a pool, one subject could go three hours before needing to " +
                "surface while the other surfaced after almost fifteen hours for unrelated reasons (they needed to defecate) and they had not yet reached their air limit.","reliable, common, safe, cheap, recreational, utility, " +
                "self, mental"));
        formulae.add(new Formula2("Refine", "R0116", 6,6,4,1,4, "R0116 is perfect for those customers looking for a simple and straightforward R-series powers. They always increase " +
                "one or more of an object's properties but do not involve modifying, manipulating, or adding additional traits, as the more complex R-series formulas tend to do. The resulting strategies tend to be as limited and " +
                "straightforward as the powers themselves. The simple nature of the formula biases the resulting classifications to Brute, Mover, and Strikers heavily. This is not to say a few of the other classifications aren't " +
                "seen, just that they are much weaker and rarer than their more common counterparts. As far as theming goes, R0116 is perfect for those looking for a medieval theme as customers tend to require bulky weapons and armor " +
                "to fully utilize their power.","safe, temporary, object-oriented, inorganic, simple"));
        formulae.add(new Formula2("Savant", "P4872", 7,2,3,1,2, "Sample P4872 is perfect for those that desire a non-visible power that isn't as complex as traditional Thinkers " +
                "and Tinkers. It, in essence, provides proficiency in one or more skills. They do not receive inhuman aid (computer hackers will not be notified of programs they cannot detect through their own means) but they " +
                "represent the most skilled people in each field. P4872-058, a subject that is gifted in understanding and applying fighting styles, will not lose a one on one fight unless there are extenuating circumstances. " +
                "Although it initially appeared that P4872 granted proficiency in one skill, it was determined that it actually gives understanding of a much smaller set of information. For example, P4872-058 was actually gifted " +
                "with perfect understanding of the kinesthetic movement of the human body. This allows them to predict the force and arch of each movement. Thinkers, Strikers, Strangers, and Movers are the only classifications " +
                "that are seen with any consistency.", "common, safe, cheap, mental, skills, self"));
        formulae.add(new Formula2("Midas", "H8723", 6,7,5,3,4, "The legendary King Midas could transmute all that he touched to gold. Although we cannot promise it will be gold, " +
                "formula H8723 grants subjects the ability to change matter into various metals and rocks. Striker ratings are common, although Brute or Changer ratings will apply to those subjects that affect their own person " +
                "while Shaker ratings are also common. A rather ingenuitive subject with the ability to self-transmute into stone was able to inflitrate a company by posing as a statue and obtained a Stranger rating. Movers, " +
                "Blasters, and Tinkers are also seen, but at significantly lower rates. Customers should be aware that their has never been an instance of a H8723 subject that could affect living tissue other than their own " +
                "(unlike in the myth), so customers needn't worry about obtaining a too-lethal power.","short-range, inorganic, elemental, stone, metal"));
        formulae.add(new Formula2("Territory", "K2051", 5,7,4,1,4, "Sample K2051 always provides powers with a Shaker classification that involve setting up a given territory. " +
                "Inside this territory, subjects either have new abilities, or their standard abilities are greatly amplified. Setting up this territory tends to be quite slow, although their are some individuals who can set up a " +
                "small territory quite fast. These areas are easily denoted by one or more lasting changes. K2051-043 created black spires that allowed him to see everything in an area around them while K2051-048 left a sphere " +
                "of constant daylight, inside which they were invisible. The spires were, as far as we could tell, permanent, while the daylight did seem to begin to fade after three years. Although K2051 subjects tend to have " +
                "lower ratings, this is only due to the fact that they require more time than normal to set up their area of effect. The PRT often raises their ratings when forced to engage them inside their own territory.",
                "safe, permanent, preparation, AoE"));
        formulae.add(new Formula2("Rupture", "V0459", 8,8,8,2,8, "Sample V0459 is chiefly dangerous by distrupting organic tissues. Even survivors of V0459 attacks are left " +
                "horribly disfigured, Even accomplished 'healing' parahumans have problems healing V0459 damage. Strikers and Brutes are the most common. In a minor subset of subjects, the tissue disruption is actually a " +
                "secondary characteristic of the trait. V0459-072 was a Master who placed a cancerous tumor onto people's eyes. If not removed, the tumo would eventually grow to encompass their face, at which time, they " +
                "became thralls of the subject. The tumor would continue to grow until the victims were monstrous humanoids with ten or more limbs, each tipped with claws and able to climb vertical surfaces. 072 was killed " +
                "by the Protectorate within thirteen days of first villainous activity. Biological Tinkers are rare, though seen.","reliable, unique, powerful, safe, expensive, terrifying, lethal, organic"));
        formulae.add(new Formula2("Dilation", "X6428", 6,8,5,1,6, "Although the practical effect differs, all sample X6428 subjects gained the ability to slow down, " +
                "speed up, or stop time. X6428-401 was a powerful Mover/Shaker who slowed down time in a wide area that stayed centered on him. X6428-032 on the other hand could make bubbles of slowed time to trap " +
                "others. In one instance, X6428-032 used this to 'hibernate' for 3 weeks in the middle of a desert when left without food and water. To them, it was a mere 2 seconds (rounded up from their stopwatch). " +
                "These bubbles could also be utilized as shields due to their membranes being a nigh-impenetrable zone of stopped time. Customers that purchase X6428 should not expect Master, Changer or Trump ratings " +
                "as these have never been seen.","unique, safe, exotic, time"));
        formulae.add(new Formula2("Dauntless", "D2169", 8,4,4,0,4, "Sample D2169 is perfect for those that want to skirt around the outskirts of combat, protecting allies " +
                "from dangers, both seen and unseen. D2169 grants increased durability (and in rare cases invulnerability) to themselves and/or one or more of their allies. It never only effects the subject; some subjects " +
                "can effect themselves as well as others, but most only effect others. A loose rule is that the more people a power effects, the weaker the durability. A notable exception to this rule was D2169-088 who " +
                "could make everyone within 50ft of him completely invincible for 12.7 seconds. However, he would then fall unconscious for 15 minutes and be unable to activate his power for 10 minutes after waking up.",
                "reliable, safe, simple, defensive, durability, others"));
        formulae.add(new Formula2("Beast", "H0009", 7,3,8,8,6, "Sample H009 always generates a subject with massively increased strength and durability. The deviations " +
                "manifest as grotesquely swelled muscles as well as what can only be described as 'animalistic' outgrowths all over the subjects body. Some subjects essentially became a beastial humanoid and the power " +
                "seemingly discarded their original body plan. Although many of these beastial forms appear to be modeled off of animal biology, they have been repeatedly shown to be more durable than steel of a similar " +
                "density. H0009-013 deviated into a 13ft tall primate with 10 eyes and several prehensile tentacles growing from their back. H009-013 also displayed severe mental deviations and was placed on the PRT kill " +
                "list because of this. They registered as a Brute 10 and were able to withstand Legend. Alexandria was eventually called in to assist and the two killed H009-013 with the assistance of three parahuman teams.",
                "common, powerful, deviant, strength, durability, size, changer"));
        formulae.add(new Formula2("Inertia", "X4737", 7,2,6,2,6, "Sample X4737 provides powers dealing with movement and momentum. This can include speeding up, slowing down, " +
                "starting, changing, or stopping movement of one or more objects. As this is a F-series formula, there is a near 100% certainty that X4737 will grant a Breaker state that will effect the subject's personal " +
                "movement. This can, as all formulas do, manifest in different ways. X4737-063 had a Breaker state that ignored friction and gravity while X4737-075 gained a Breaker state that absorbed all incoming kinetic " +
                "energy and allowed her to utilize it in motion upon entering a different state. Other powers relating to movement should be expected, X4737-079 could shoot bolts of what she called 'motion poison', and as " +
                "movement is such a key staple of X4737, a Mover classification or sub-classification should be expected, although not guaranteed.","common, safe, utility, movement, kinetic, exotic, gravity"));
        formulae.add(new Formula2("Gargoyle", "H3275", 7,5,5,3,4, "Sample H3275 provides increased durability by changing the subject's body into a much harder material. Some " +
                "subjects developed an entirely separate Changer form that they could shift in and out of at will. This Changer form was always between 5ft and 10ft tall and resembled a creature made of stone (thus this formula's " +
                "name). More often, subjects gained the ability to Changer their body into a harder material (a much milder transformation). The exact nature of these transformations varied, both by type of transformation and " +
                "material. H3275-099, for example, gained an unconscious, reactive power that caused him to shift his body into a titanium alloy every time his body felt a strong impact.","durability, self, elemental, stone, " +
                "metal, changer, defensive"));
        formulae.add(new Formula2("Squamate", "D4166", 7,7,4,1,5, "Seemingly based on reptilian regeneration, sample D4166 is perfect for customers looking to be a field medic. " +
                "It grants regeneration and other useful healing-type abilities to others, and in over 80% of the cases, subjects also retained the abilities for themselves. Many D4166 subjects have been able to treat incredibly " +
                "traumatic wounds and have their targets up and walking within minutes. D4166-121 possessed an aura that caused all wounds in a 50 yard radius of him to clot quickly, to the point where losing an arm was not a " +
                "life-threatening injury. His aura also helped serious injuries, such as lost arms, to heal. In three tests, he healed three lost arms, eventually to full usage over the course of a month for each arm. Other " +
                "subjects can grant subjects temporary 'stitches' that make wounds effectively null for several minutes, although medical treatment is required after these stitches expire.","simple, safe, utility, others, " +
                "regeneration, organic"));
        formulae.add(new Formula2("Patience", "K0398", 8,7,8,0,7, "Perfect for those customers looking to be revered as telekinetic powerhouse, sample K0398 is the most powerful " +
                "K-series formula, in terms of raw telekinetic strength. Subjects on the low end of the spectrum often lift upwards of 1800 lbs. It is common for subjects to have limitations, such as having to physically touch " +
                "objects before they can lift them, having a range limit, or having to take time to 'ramp up' their power before reaching maximum strength. K0398 subjects who can adequately utilize their powers are likely to be " +
                "the hardest hitters on any given team and should expect to be well-known. A rare few K0398 subjects had more severe limitations in the vein of limiting what they could control. This includes subject K0398-002 who " +
                "could only manipulate dirt/soil. It should be noted that most K0398 subjects could not control organic matter. With planning, these limitations can considered inconsequential.","variable, safe, telekinesis, " +
                "preparation, versatile, powerful"));
        formulae.add(new Formula2("Gloom", "V2446", 5,8,5,2,5, "Sample V2446 was designed for creatures of the night. Almost 90% of V2446 subjects developed a form of night vision, " +
                "and many of their granted powers work better after dark. Some subjects even have developed the ability to absorb light or manifest darkness. The powers of V2446 vary greatly, with each of the twelve classifications " +
                "being present. Deviations vary from the subject always looking as if they are standing in shadow to subjects developing severe photophobia. Examples of V2446 powers follow. Subject V2446-095 could generate clouds " +
                "of shadow that dulled powers and senses alike. Those trapped inside report feelings mild vertigo and powered individuals say they felt as though their powers were 'foggy'. Subject V2446-049 gained near-instant " +
                "regeneration, to the point where running through the shadow of a telephone pole healed a cut across his chest that would have required forty stitches.","unique, safe, terrifying, utility, stealth, sensory, " +
                "shadow"));
        formulae.add(new Formula2("Queen Administrator", "U1062", 8,4,4,0,4, "Master powers are almost a guarantee with sample U1062. Sample U1062 grants control over a group of objects, " +
                "animals, etc. This can include a type of animal (U1062-013 could control birds while U1062-012 could manipulate insects) or technology (U1062-126 interfaced with technology) or various other things. Some subjects are " +
                "limited by the number of minions they can have at any given time, while others are only limited by the number of minions in their range. The amount of control and other abilities also varies, U1062-013 could look " +
                "through the eyes of birds, but U1062-012 could control every minute movement of every insect in her swarm. Minor secondary abilities, such as a multitasking ability, are common to help subjects maximize their power. " +
                "This formula is perfect for customers that fancy themselves battlefield strategists.","reliable, safe, versatile, master, multitude, animal, environment"));
        formulae.add(new Formula2("Superman", "A0081", 10,1,6,1,6, "This formula turns subjects into Alexandria-style parahumans. Every subject that has imbibed A0081 has developed " +
                "unaided flight, increased durability, and at least a minor strength boost. The exact ratio of these powers differs from subject to subject, with some subjects reaching near-sonic speed while others are nigh-indestructible. " +
                "A few subjects were only stronger and/or more durable while flying, but the vast majority have the standard powerset that is always active. Customers should know that, due to this powerset being so common, it will " +
                "be more difficult than average to achieve any sort of notoriety. This is a very useful, jack-of-all-trades powerset that is almost always useful on any team and in any situation.","simple, versatile, self, " +
                "durability, strength, movement, flight, reliable, common, safe"));
        formulae.add(new Formula2("Speedster", "F2323", 8,3,5,1,5, "Sample F2323 is perfect for customers longing to possess super speed. Almost all subjects gained some sort of increased " +
                "speed. The average running speed of sample F2323 subjects is around 100 feet per second. A large number of subjects develop variations of traditional super speed. This can include trails of varying effects to personal " +
                "effects such as a loss of tangibility while moving. Subject F2323-138 was able to run 82 feet per second and gained density temporarily while running. At maximum speed, subject F2323-138 could hit with nearly four times " +
                "the force of the average human. They could not speed up part of their body, however, they must be running to use their abilities.","reliable, common, safe, simple, utility, self, movement"));
        formulae.add(new Formula2("Fenrir", "H0810", 6,5,5,3,4, "Sample H0810 provides Changer powers that would, mostly, be called animalistic. This can be anything from large, dense " +
                "tank-like creatures to small, fast assassin-type creatures. The sub-classifications that H0810 subjects take on vary, but they will mostly be Brutes, Movers, and Strikers. Many of the alternative forms sport wings, " +
                "toxins, or other adaptions that are seen in many animals on Earth. Interestingly, although all changes from H0810 are biological, there have been several instances where the changes do not represent biology that is " +
                "currently seen on Earth and is most likely from alien planets. No inorganic or plant matter forms have been seen in H0810, and the more serious deviations tend to be mental in nature, primarily increased aggression " +
                "and lowered mental clarity.","self, organic, animal, changeer"));
        formulae.add(new Formula2("Stopgap", "R1177", 6,4,6,2,5, "Sample R1177 grants powers that cause changes, but only for a set amount of time. After that time is allotted, the " +
                "effected target(s) will (usually) revert back to it's original state. In some cases, the target is granted certain properties then, after the time has expired, will be given other properties. These secondary properties " +
                "are usually temporary as well. The changes caused are usually quite drastic and have a large effect on the battle. Subject R1177-055 projected spinning tesseracts that, upon contact, caused inorganic matter to disappear. " +
                "Exactly 23.6 seconds after contact, the objects would reappear. The objects would be slightly iridescent and have increased durability. These changes were permanent. This made R1177-055 valuable both as an anti-Tinker " +
                "Blaster and as a supporting Shaker that could slowly reinforce buildings and other equipment over time. Each shot effected approximately 40kg of matter, although R1177-055 could somewhat control this. The power preferred to " +
                "affect a complete object first before moving on to other objects nearby.","safe, utility, temporary, versatile, object-oriented, inorganic"));
        formulae.add(new Formula2("Passage", "F3447", 8,7,8,1,8, "Sample F3447 should definitely be considered for all customers that have a desire to become one of the rare mass teleportation " +
                "capes. These are highly sought after and many of our former customers have received lucrative employment offers due to their uncommon abilities. The main drawback of sample F3447 is that around 50% of subjects cannot travel " +
                "using their own ability. This makes them very good at ferrying others around, often moving people across entire continents, but leaves them vulnerable on a battlefield. Depending on the nature of the granted power, this makes " +
                "some F3447 subjects more valuable in a non-combat, utility sense. As they are so valuable, F3447 are likely to be kept far away from Endbringer battles, so customers not wanting to participate in them are encouraged to look at " +
                "F3447.","reliable, powerful, safe, expensive, utility, others, long-range, multitude, movement, teleportation"));
        formulae.add(new Formula2("Horizon", "V2248", 6,9,9,2,9, "Sample V2248 kills by creating incredibly dangerous areas of high pressure, gravity, heat, etc. These zones require several seconds " +
                "to set up and usually allow enough time for those in the area to vacate, but afterward the area becomes inaccessible to all but the most durable of Brutes. The zones themselves can be any shape, number, or size depending on the " +
                "subject. V2248-010 created up to fourteen black hole singularities that effected a circle with a 8.3ft diameter each while V2248-051 enveloped themselves in a haze that reached temperatures estimated to be inside a dwarf star. " +
                "V2248 subjects almost always obtain Shaker classifications with subjects like V2248-051 being notable exceptions to this rule. V2248 customers should pair themselves with other Shakers to maximize their effectiveness as it is " +
                "hard for solo V2248 to do maximum damage due to their ramp up time.","unique, powerful, safe, expensive, terrifying, lethal, exotic, temperature, gravity, AoE"));
        formulae.add(new Formula2("Cogent", "L8001", 9,3,6,1,6, "Thinkers are often the movers and shakers (metaphorically speakings) of the cape world. They are often plan strategies for everything " +
                "from day-to-day operations to Endbringer attacks and are key to countering enemy Tinkers. Sample L8001 provides problem-solving Thinker abilities to those customers that choose to purchase it. Although the specifics of each power " +
                "can change, every one is incredibly helpful in strategizing. The one caveat is that L8001 powers usually lack any precognitive abilities and rely on concrete facts and data being provided to them to work properly. If a L8001 " +
                "subject is given misinformation when planning, the plan is likely to fail. But customers should note, in experimental situations, 73% of L8001 customers could recoordinate their plans to succeed in the midst of conflict, even " +
                "after given initial false information.","reliable, basic, safe, utility, mental, solution"));
        formulae.add(new Formula2("Ailment", "M2301", 8,8,4,0,6, "Sample M2301 causes systemic problems in their targets. These problems, though, are never deadly and are more of a nuisance in the " +
                "broad sense of things. It may seem counter-intuitive to many customers, but these can often be the most useful powers in combat as they can be used to their fullest extent without hesitation. M2301-022 was instrumental in the " +
                "capture of three former Slaughterhouse Nine as they caused severe nausea in everyone in a 100 yard cone in front of them. The majority of targets immediately vomited. M2301-035 became an expert thief that could cause " +
                "extreme vertigo in everyone within 30ft of them. Other M2301 subjects obtained more... unconventional jobs. M2301-105 could bestow a variety of illnesses from colds to stomach aches and M2301-106 could secrete ticks that " +
                "remained for years, if not more. Together they started a 'revenge' service wherein others paid them to make others' lives miserable. It should be noted this is a highly abnormal experience.","reliable, unique, safe, " +
                "temporary, others, organic"));
        formulae.add(new Formula2("Ragdoll", "D1842", 10,1,4,0,5, "Sample D1842 provides increased durability to the patient. 89% of subjects had no visible indications of their durability " +
                "and resembled average humans. The durability is often much more so than other Brutes with the same rating, but D1842 rarely grants increased strength or other effects. The formula is named such because subjects are often " +
                "thrown around like ragdolls on the battlefield, but are rarely harmed. D1842 subjects tend to not be major threats to their enemy's safety, but they do become quite consistent threats that must be dealt with repeatedly " +
                "throughout battle. If equipped by a Tinker or otherwise aided, they can become quite dangerous on the battlefield.","reliable, common, safe, simple, defensive, self, durability"));
        formulae.add(new Formula2("Screen", "U2262", 6,2,6,2,5, "Sample U2262 is primarily concerned with the creation of force fields. This can manifest itself as a primary ability, or as " +
                "a secondary effect. Shaker classification has been seen in 78% of U2262 subjects and should be expected. Other classifications that have been witnessed are Mover (U2262-129 created a line of force fields in her wake) to " +
                "Blaster (U2262-115 shot shards that exploded into 'shard webs') Tinker (U2262-091). Sample U2262 subjects are, by the nature of their powers, required to be active on the battlefield to be of use to their team. They are " +
                "strong against most Blasters, although they are weak against those that manifest things at range or non-linear Movers. These Blasters and Movers are able to bypass the subjects' force fields and often times render them " +
                "completely moot. The only exception is a handful of U2262 subjects that make opaque/transparent force fields or so many force fields that targeting between the force fields becomes tricky. An even rarer subset have " +
                "created force fields with Trump abilities that don't allow powers that touch them to work at all.","common, safe, creation, defensive, versatile, force field, shield"));
        formulae.add(new Formula2("Dwindle", "S1683", 7,6,6,0,7, "Sample S1683 is relatively straightforward as far as Trump powers go. The main theme among all powers found in S1683 subjects " +
                "is an ability to reduce, decrease, or suppress the powers of other parahumans. The 'delivery' of this effect is never the same way twice. Some S1683 subjects possess powers with complex effects, only one of which is their " +
                "Trump ability, while other S1683 subjects' powers are as simple as a touch ability that reduces the effect of other parahumans' powers (S1683-108). Only 3% of S1683 subjects displayed the ability to modify the 'parameters' " +
                "of powers. Around 18% had some way to entirely suppress parahuman abilities. Some of these effected wide areas, while others could only effect one person at a time. An interesting example of this extreme was subject S1683-047. " +
                "His touched suppressed the power of any one parahuman he touched, but he had to remain in contact with them to keep them suppressed.","safe, utility, others, power-affecting"));
        formulae.add(new Formula2("Perception", "Q0089", 8,5,4,1,4, "Sample Q0089 has granted augmented or new perceptions in 100% of subjects and customers who have imbibed it. This can be " +
                "as simple as telescopic sight(Q0089-017) or as complex as sensing people who feel negatively toward the subject(Q0089-093). Although it is possible for complex senses with no easy physical manifestation, such as Q0089-093, " +
                "it is more likely for powers to sense more concrete phenomena. Seeing infrared is a common minor secondary power and is seen in 47% of subjects. The most common severe deviations seem to be a malformed protection from " +
                "subjects' senses. In effect, subjects cannot choose to ignore their granted senses. Although this specific instance has not happened, an example of this would be a subject with enhanced hearing that could not ignore " +
                "even the smallest sounds, making sleeping or holding a conversation almost impossible. Depending on the nature of a given subject's power, Thinker and Stranger classifications are the most common. A rare few Tinkers " +
                "and Masters have been noted. Tinkers tend to focus on sentries and turrets while the Masters usually can hijack one or more senses of others.","reliable, safe, utility, mental, sensory"));
        formulae.add(new Formula2("Freefall", "X1614", 7,4,4,1,4, "The Breaker states offered by sample X1614 alter the subjects' relationship with gravity. Some affect gravity's effect " +
                "on them, changing its direction or strength among other things, while others affect their effect on gravity in the area. This can result in drawing things to them, pushing things away from them, or any number of other " +
                "effects. With intelligent use, over 90% of X1614 subjects qualified for at least a minor Mover classification. Stranger ratings are also quite common, although they are never more than minor. Around 66% of X1614 subjects " +
                "developed secondary, gravity-related powers besides their Breaker state. Due to the nature of gravity, these secondary powers almost always fall into the Shaker category. A good example of this is X1614-033 who is " +
                "classified as a Shaker/Striker 6, Breaker 4. Her Breaker state allowed her to ignore gravity completely while her touch could cause an object to exhibit a gravitational field similar in strength to Earth. The field " +
                "extended between 30-50ft from the object before abruptly ending.","reliable, safe, exotic, gravity, AoE, changer"));
        formulae.add(new Formula2("Marrow", "V2301", 7,9,5,2,5, "Sample V2301 is based around the manipulation of bones and the skeletal structure of animals. Most V2301 subjects gained " +
                "powers that dealt with bones already in existence, although some worked with bones that they drag into existence themselves. Aggressive powers tend to attack with spikes and spears while defensive powers use dense " +
                "plates of bones to shield themselves and others. The bones that these powers utilize are not porous like normal bones and as such are much denser and harder. Therefore, customers should be advised that the bones from " +
                "V2301 are much closer to steel than what they would consider normal bone. Some of the bones even appear to be of alien composition and contain harder elements. Deviations commonly involve malformations of the subject's " +
                "skeleton, mainly in the form of bony protrusions that grow out of their skin. Durability, regeneration, and a minor strength factor are common secondary powers, this is a major reason why well over half of subjects gain " +
                "a Brute classification.","terrifying, versatile, durability, regeneration, organic, animal"));
        formulae.add(new Formula2("Cadaver", "V0992", 7,10,5,2,5,"Potentially the most universally unsettling of the V-series, sample V0992 grants powers that deal with decay and the dead. " +
                "Sample V0992 is also one of the most diverse V-series formulas in terms of the classifications and power level of the powers it has granted subjects. V0992-111 was a Master 7 with the ability to control all human corpses " +
                "within an area and give general instructions. V0992-067 was a Blaster 8 who shot a teal ray that decayed organic matter. On the other side of the spectrum, V0992-012 was a Thinker 2 who could project the events of a " +
                "cadaver's life onto the nearest wall. Interestingly, V0992-012's power worked on animal cadavers as well and currently is working to help understand how poachers are operating in northern Africa. Customers should be " +
                "noted that most V0992 recipients tend to have lower popularity ratings among the average population; some may see this as an advantage.","unique, safe, terrifying, organic, death"));
        formulae.add(new Formula2("Numerology", "P5040", 8,6,4,1,5, "Sample P5040, as its name implies, grants mathematical Thinker powers. Although the practical effects can be quite " +
                "broad, every subject in the P5040 test group reported the effects as a greatly augmented understanding of numbers and increased calculation speed. Common groups of powers are those relating to angles/projectile pathing, " +
                "force/motion, and probability. While some subjects have very limited application of their powers (P5040-019 could only run calculations on objects he threw, albeit always hitting his mark), while others are quite " +
                "broad. P5040-028 was the most outstanding individual, being nearly untouchable because he could see the trajectory, speed, and momentum of every object in his field of view. His grandest feat was falling nearly six " +
                "stories without injury as he claims to have seen the exact actions to mitigate the kinetic energy of the fall.","reliable, safe, mental, processing, agility"));
        formulae.add(new Formula2("Edict", "X1322", 6,10,5,1,6, "Sample X1322 is a bizarre formula that allows the subject to change 'rules'. Some of these can be as simple as changing " +
                "a single property of an object (subject X1322-011 could make any object bounce off of other objects as if it were as elastic as a bouncy ball) or as abstract as to change many rules in a large area involving object " +
                "interactions (subject X1322-097 appeared to almost bend reality itself into a caricature of real life by changing how time and space related to one another). Most X1322 subjects are labeled as Breakers, Masters, or " +
                "Shakers depending on who the rules effect: self, others, and an area, respectively. Ingenuity is always useful to parahumans, but is deceptively necessary in the case of potential X1322 customers. The power to slightly " +
                "rewrite the laws of reality seems powerful, but without a plan, X1322 powers can quickly just become engines of mindless chaos on a battlefield. PRT ratings will be heavily determined by whether a customer has the " +
                "foresight to optimally apply the powers they are given.","unique, safe, versatile, complex, utility, exotic"));
        formulae.add(new Formula2("Arbitration", "U2306", 7,7,6,2,6, "Sample U2306 can be seen as the 'balance' formula of the U-series. U2306 never creates or destroys anything, but " +
                "merely shares the traits of one object with another object. This can manifest as a personal effect all the way up to an effect on an area. Subject U2306-180 could equalize the speed of people in an 80ft diameter area " +
                "while subject U2306-045 could temporarily 'absorb' the hardness of an object, making steel as fragile as glass while making himself nearly invincible. U2306-045 was able to 'absorb' from 5-10 objects for a maximum " +
                "of 2 minutes before he lost his grip on it. He described it as trying to hold water; it always eventually leaked out. Shaker or Striker are very common ratings, with Master classifications almost non-existent in " +
                "U2306 formulas. Many classifications come from non-standard applications of the given power. U2306-035 could switch the temperature of objects within 20ft of herself. She got a Blaster 8 rating after she figured " +
                "out she was not Manton limited and would routinely switch a person's body temperature with that of the outside environment, sending several heroes into hypothermic shock before she could be caught.",
                "safe, complex, utility, AoE"));
        formulae.add(new Formula2("Cerberus", "M2250", 8,4, 5,1,4, "Sample M2250 tends to affect an animal or group of animals near the user, oftentimes giving at least limited " +
                "control over it. Some powers seem to create temporary effects that quickly subside after the subject has been removed from the area. Other times, the effects seem to permanently bond the first animal (or animals) " +
                "affected to the subject. The number of animals effected or created seems tied to how that type of animal behaves in the wild. This means only one solitary predator is effected, but if the subject controls insects " +
                "the numbers often range into the hundreds of thousands. It is unclear if the creatures 'created' by this power are truly formed on the spot or if they are transported and then bound like ordinary animals. Many " +
                "seem to have similar anatomies to other organisms seen in other powers across the globe. Although a rare occurence, some of the 'animals' created are better termed 'spirits'. They can be immaterial, a ghost with " +
                "powers all their own, or they can appear almost elemental in nature, a creation of loosely floating rocks that appear snake-like in shape. These are exceedingly rare, however, and so we have decided that the " +
                "Cerberus formula fits best into the M-Series of formulas.","reliable, safe, simple, utility, versatile, aura, organic, animal, master"));
        formulae.add(new Formula2("Blessing", "R0316", 8,7,5,1,6, "For the more religiously minded, formula R0316 bestows a variety of qualities and powers to items, although R0316 " +
                "subjects tend to have less control over what exactly these 'blessings' can do. Most of the powers rely on spur of the moment uses in battle. Unlike many R-series formulas, this formula seems to works best when " +
                "there is absolutely no foreplanning. Blind faith in the power is what drives most R0316 capes to success, although there are always limits. Changes to items tend to be temporary, some lasting no more than several " +
                "seconds. Most R0316 powers also often have brilliant, over-the-top displays when empowering items, with fire, lightning, and light very common among them. This is a formula that can easily have a theme built around " +
                "it, often bringing images of paladins in the look of gifted powersets. This is not a good choice for anyone that wants to lay low or those looking to outfit their entire team with super-powered weapons. Those looking " +
                "to be play a primary, albeit unpredictable, fighter that is not easily forgotten should consider formula R0316.","reliable, safe, theme, versatile, object-oriented, elemental"));
        formulae.add(new Formula2("Apathy", "L0100", 3,8,9,9, 8, "Heartless killers are the product of L0100. Very few things remain consistent between L0100 except a lack of remorse " +
                "for literally any of their actions and a power that allows for unrivaled brutality in combat. At this point, many corporate customers looking to hire parahuman hitmen may think the psychological effects of L0100 " +
                "are minimal, maybe even an asset. Customers should be cautioned that the lack of emotion often leads to sadism and a lack of care for any previous alliances or responsibilities they may have had. Subject L0100-042 " +
                "previously worked for a Dutch bodyguard service, but after being denied a high-profile client he went rogue, killing the client to prove the other agent was inadequate, before executing the agent. Ever since he " +
                "has preyed on any and all of his former employer's clientele, effectively driving them out of business. His powers involved manipulating knives, or any blade below one foot in length. Upon touching them, they " +
                "disappeared. They remained invisible permanently, while also allowing 042 to telekinetically control them with pinpoint precision; a bladestorm invisible to the eye. A more defensive powerset can be seen in " +
                "L0100-013 whose body shifted into an ethereal state if it was ever in danger. This happened only to parts at a time, allowing him to continue holding items while being attacked. He was stopped only by Alice, " +
                "a parahuman from the Indian team who sealed him within a pocket dimension.","variable, unique, powerful, deviant, expensive"));
        formulae.add(new Formula2("Otherworld", "L0072", 5, 9, 9, 10,9, "Eyes replaced by miniature black holes, mouths sprouting from necks and backs, reacting to people and " +
                "events that took place years ago or have yet to take place, all have been seen in L0072 subjects. Every subject has developed a deviation, either physical or mental, that are often anomalies of biology or " +
                "physics. Although incredibly hard-hitting, L0072 powers often hit at odd angles, creating mind-bending tricks of physics, often with no correlation between subjects. L0072-001 sent orbs of electricity " +
                "jittering through the air, but each traveled only in a straight line, stopping and turning at right angles before rocketing onward. L0072-002, on the other hand, had gaping empty holes where her arms should " +
                "be, but she could open portals at will through which massive, 60 ft. arms appeared. Although deviations appear otherworldly, almost all L0072 parahumans retain their human vulnerabilities; very few Brutes " +
                "ever appear and usually only through intelligent use of a power's secondary properties. Further refining of this formula may, in time, sprout new formulas, each geared toward a subset of the displayed " +
                "powers and with fewer of their weaknesses. For L0072 subjects now, though, the human vulnerability seems to be one of the few totally human things left intact.","unique, powerful, deviant, expensive, " +
                "terrifying, complex, versatile, exotic, otherworldly"));
        formulae.add(new Formula2("Tai Chi", "K2365", 7,8,4,1,6, "Like the martial art namesake, formula K2365 focuses on redirecting and mitigating the energy of opponents " +
                "blows, sometimes turning it back on them in a devastating counter. The resulting powers of K2365 parahumans can be split into two groups: those that deal with kinetic energy, and those that deal with other " +
                "kinds of energy. In a similar fashion, the threats of the parahumans vary wildly depending on their opponents, with kinetic-oriented capes fairing better against Movers, Brutes, and Strikers but being incredibly " +
                "vulnerable to Blasters and Breakers. Some K2365 powers stick close to the namesake, redirecting energies around or through the cape while others use the incoming power to charge themselves like a battery or " +
                "just make the energy disappear all together. A low-level Striker/Shaker, subject K2365-010 could instantly stop the movement of any non-viscous liquid he touched. He was written off as one of the marginally " +
                "powered, until he helped quell a tsunami wave caused by Leviathan, saving hundreds if not thousands of lives. Sadly he was killed on the third Leviathan attack after this discovery. We advise customers that " +
                "Tai Chi is a formula best suited to team-oriented capes, although it is still possible to go solo. We must reiterate, however, that creativity and a high aptitude for thinking outside the box is required to " +
                "counteract the inherent lack of defenses from attacks not covered by the granted power. We do offer premium packages for customers looking for advice post-trigger event.","unique, safe, complex, versatile, " +
                "elemental, kinetic"));
        formulae.add(new Formula2("Location Location", "W4630", 8,8,6,2,8, "Mover/Shakers are the single most common occurence from formula W4630. The formula principally creates powers dealing " +
                "with the relation of space, connecting distant places, enlarging or shrinking, on scales both large and small. Masters and Trumps are the only classifications never seen from W4630. Many W4630 subjects have low-level " +
                "Thinker ratings in the form of a localized omniscience, allowing them to sense everything within a distance of them at all times. W4630-157 required a massive deprivation tank while he slept as any motion, even as " +
                "small as a gnat, was too annoying. Of the classifications that have been presented, Blasters are the rarest and arguably the least effective. Their powers often function as smaller, ranged variants of the other " +
                "space-warping powers displayed by W4630 capes. The powers from this formula will definitely require some thorough practice to master and we recommend customers train with a team for several weeks before deploying " +
                "with them in the field. The Trentvale Incident is a perfect example of a W4630 Shaker's team being ill-prepared for the chaos she would sow on the battlefield and all five, including the customer, died because of it. That " +
                "may be ominous, but we guarantee that W4630 powers are no more dangerous to allies than other powers once everyone becomes comfortable with their presentation.","reliable, unique, safe, expensive, versatile, " +
                "exotic, space, movement, sensory"));
        formulae.add(new Formula2("Division", "T2770", 6,8,4,1,5, "Almost all subjects that imbibed formula T2770 eventually obtained a Master classification or subclassification. " +
                "The formula is so titled because the minions most often sprout from either the subject themselves or a target, in one way or another. These minions always have characteristics of their 'parent' and are usually " +
                "humanoid in shape. Control of them seems limited, with only general goals being able to be conveyed. Sometimes the power can more aptly described as a spliting or a cloning, as in the case of T2770-232 who split " +
                "off into a series of four duplicates of himself over the course of combat. these minions are more often than not temporary, either rapidly decaying or being reabsorbed after use. Another common trope among T2770 " +
                "powersets are various forms of reanimation or resurrection where if the subject dies while their minions are active one of the minions 'becomes' the subject, with all past memories and abilities. It is unclear if " +
                "it is a true transfer of consciousness or a mere duplication, but the observed effect remains the same. The most common deviations involve extra sets of body parts, most often eyes and limbs. An interesting example " +
                "was T2770 who was discovered months after activation to have two independent circulatory systems, including two separate hearts that beat in unison.","unique, safe, creation, utility, temporary, resurrection, " +
                "organic, master"));
        formulae.add(new Formula2("Mimic", "U0995", 3,9,5,1,7, "Formula U0995 always creates powers that must draw on their environment for inspiration. Besides that, there is little " +
                "that ties the resultant powers together. An example testing batch: U0995-030 developed the ability to shift her general body shape to match those of others, although exact features took some time, U0995-031 could " +
                "absorb nearby material to gain its durability and U0995-032, the only deviant, shifts their body between a seemingly limitless set of forms that all seem perfectly suited to their current environment and his/her/its " +
                "mood. Besides a Changer rating, Stranger and Brute ratings are most common but all have been seen, with Stranger comprising mostly of those that draw from the organic world while the Brutes tend to mimic inorganic " +
                "material. As a quick aside, it is mimicry and not true replication as the subject's bodies do not truly become metallic or anything in-organic, just durable. This was confirmed with a set of Manton limited capes where only the " +
                "organic-affecting cape could induce any affect on U0995 subjects. Many U0995 subjects have reported this seemingly minor trait has helped them gain a surprise edge in more than one situation against villains (or " +
                "heroes) who wrongly assume their Changer form is whatever material it appears to be. The power level of this formula varies wildly, but it is truly original, making up for its higher price tag.","variable, " +
                "unique, safe, utility, organic, environment, changer"));
        formulae.add(new Formula2("Balance", "Z0000", 10,1,1,0,2, "The Balance formula is sometimes referred to as the Human formula as it seems to reinforce the idea of a perfect " +
                "human. This formula gives very mild powers at best, but one thing that should be noted is that it restores the drinker's body to a state of near perfect health. In tests it has cured various cancers, partial and " +
                "full paralysis, cerebral palsy, and even schizophrenia. This is a one-time occurence during the trigger event and does not always prevent the subjects from becoming ill again in the future from other means. We " +
                "recommend that customers only use this formula to help temper the deviations in other formulas and only taka Z0000 in full if they are content with the one-time healing being the only significant result. Strictly " +
                "speaking, a mixture with 5-15% Balance is what we recommend customers. It significantly lowers the chance of deviation for only a comparably minor drop in power potency.","reliable, common, safe, cheap, formula modifier"));
        formulae.add(new Formula2("Century", "X0023", 10, 7,1,10,0, "We are not quite sure exactly what percentage of X0023 subjects are true deviants, or the true variety of powers. " +
                "X0023 seems to be a time manipulation power that sends subjects into the future. Far into the future. Our only real, full-formula evidence is X0023-012, a subject tested in the first few months of the company. She " +
                "only consumed a half-dose and appeared exactly 4 years and eleven months later with no knowledge of the time that had passed. It is believed the rest of the subjects have been sent farther onward or even possibly " +
                "back into the distant past, although there may be no way to test this hypothesis. It is not recommended that customers take X0023, although in extremely small doses (no more than 5%) there has been some limited success " +
                "in producing time capes, albeit with large amounts of other time-related formulas. Any customer who wishes to use Century in their vial mixture is liable for a discount on the final price. In the future, we hope to " +
                "obtain more data either in the form of more X0023 testing or, if we are lucky, some of the original X0023 test subjects reappearing.","reliable, deviant, free, permanent, exotic, time, self, formula modifier"));
        formulae.add(new Formula2("Zeus", "J1024", 4,5,7,4,7, "As the namesake god, J1024 subjects gain immense electrical power, albeit at a risk of deviation. These deviations often " +
                "take the form of perceived 'godly' traits and shouldn't dissuade customers too much, as long as they are comfortable always being perceived as a parahuman. The exact manifestation of powers varies wildly, but an " +
                "electrical element is a certainty. Interestingly, Brute powers are also seen often, although rarely exceeding a Brute 4 or 5. Due to the nature of electricity, Shaker and Blaster ratings are often seen, at " +
                "least in low levels. Stranger powers are never seen. Anyone consuming J1024 should expect to display their powers loud and proud and will always draw attention to themselves in combat. Along with the other formulas " +
                "named after the Greek pantheon, J1024 can be used to make a very consistent theme.","theme, Olympic, versatile, mid-range, self, durability, strength, elemental, electricity"));
        formulae.add(new Formula2("Poseidon", "K0512", 4,5,7,3,7, "Like the Olympian, a K0512 subject's power revolve around water, either drawing powers from it, or controlling it. " +
                "Some of the best teams involving K0512 capes involve having a teammate who can transport the vast quantities of water that are sometimes needed by the Poseidon subjects to reach their full potential. Obviously, " +
                "coastal cities are the best spot for K0512 subjects to end up and customers who intend to live inland or away from large bodies of water may want to consider another formula. The most common minor deviations involve " +
                "water behaving strangely around the subjects, or coloration inconsistencies that ripple across the skin. Major deviations can include fins, gills, tails (to varying degrees), and facial abnormalities. Trumps and pure " +
                "Blasters have never been seen, although many Shaker classifications use massive amounts of water to hit enemies from range, giving them a secondary classification as a Blaster if they use it often. Minor Brute " +
                "powers often appear as secondary powers as well. Along with the other formulas named after the Greek pantheon, K0512 can be used to make a very consistent theme.","theme, Olympic, environment, " +
                "shield, elemental, water, regeneration"));
        formulae.add(new Formula2("Hades", "J0666", 3,3,7,4, 7, "The ruler of the underworld, Hades was the Master of fire and brimstone. Like their spiritual parent, J0666 subjects " +
                "have either pyrokinesis or terrakinesis with pyro features. Blasters and Brutes are the most common, with fireballs, streams of fire, or meteoric chaos all having appeared repeatedly during testing. Precision is rare, " +
                "with formula J0666 seeming to prefer widespread effect instead. Deviations are as expected: flaming eyes/hands/heads, permanent dryness, some report hearing voices. True to their namesake, J0666 subjects are among the " +
                "most sadistic in tha Olympic Pantheon series of formulas, although this could be a result of who tends to choose the Hades formula and not a result of the formula itself. Among the other Olympic Pantheon formulas, Zeus " +
                "and Poseidon are the only ones that rival Hades' raw power. Along with the other formulas named after the Greek pantheon, J0666 can be used to make a very consistent theme.","variable, common, theme, Olympic, " +
                "versatile, short-range, mid-range, durability, elemental, fire, AoE"));
        formulae.add(new Formula2("Hephaestus", "Q0125", 7,2,6,1,6, "As the smith of Olympus, Hephaestus was in charge of building all of the tools of the gods. Formula Q0125 always creates " +
                "a combat-oriented Tinker who, like Hephaestus before them, can outfit their team to survive many fights. While the exact specialization varies, many patterns have emerged during testing. Tinkers focused on weapons build melee weapons " +
                "83% of the time, while other Tinkers tend toward smaller devices as opposed to large constructions. Of the armor Tinkers (approximately 12% of all Q0125 subjects), almost all produced ornate, decorative armor, very much " +
                "in the vein of godlike armor. Unlike most other Tinkers, Q0125 subjects have relatively stable equipment that can go weeks at a time without needing maintenance, which aids in them supplying their team and keeping gear in " +
                "working order. Along with the other formulas named after the Greek pantheon, Q0125 can be used to make a very consistent theme.","common, safe, theme, Olympic, shield, durability, simple, short-range, tinker"));
        formulae.add(new Formula2("Aphrodite", "T2011", 7,8,6,2,6, "The loveliest of the gods, the subjects who embibed the formula named after Aphrodite continue to enchant people around the " +
                "globe today. Powers from formula T2011 manipulate the emotions and feelings of others, or give massive insight into the behavior of those around them. Of all the Olympic Pantheon series, Aphrodite subjects are most likely to be " +
                "gifted with Stranger and Master powers. Deviations are rare but when they appear, they are almost always mental alterations. Violent mood swings, psychopathy, and severe histrionic personality disorder. Interestingly, the presence " +
                "of a T2011 parahuman lowers the chance of severe deviations in triggering parahumans, suggesting a possible minor Trump characteristic. As only twenty tests of a full Aphrodite formula have been tested to this date, we cannot rule " +
                "out a strong Trump ability as another possibility. Along with the other formulas named after the Greek pantheon, T2011 can be used to make a very consistent theme. Customers that attempt this theme should be aware, though, that " +
                "the flashier abilities will draw the focus away from the more subtle powers of T2011 and customers not choosing Hades, Zeus, or Poseidon in particular should be aware that they are not likely to be perceived as one of the leaders " +
                "on their team.","unique, safe, theme, Olympic, complex, others, mental, emotions, master"));
        formulae.add(new Formula2("Hermes", "H0112", 8, 2,4,1,6, "The Hermes formula is, perhaps, the weakest formula in the Olympic Pantheon series in terms of raw power output, but it also one of " +
                "the only to have a deviation score of only 1. As with all other formulas in the Olympian series, the powers granted by H0112 are related to the god it is named after. In this case, H0112 produces mostly Mover powers, often accompanied " +
                "by some sort of bright light. In a team full of powerhouses, customers that drink the Hermes formula will have to rely on their quick thinking to maximize their effectiveness. True to the original hooligan, those that perfect their " +
                "powers will be the nuisance on the battlefield that doesn't go away. Very few non-Movers have any way to keep a H0112 subject from following them wherever they please, and wherever they go, their team is not far behind. Secondary " +
                "powers with ratings of 1-3 are often seen, although these change drastically from subject to subject, seeming to fit individual personalities. Along with the other formulas named after the Greek pantheon, H0112 can be used to make " +
                "a very consistent theme.","reliable, common, safe, theme, Olympic, grab-bag, utility, movement, agility"));
        formulae.add(new Formula2("Ares","I0273",9,1,5,2, 5, "Ares is the cheapest of the Olympic Pantheon formulas and also the most reliable. It always produced a Brute power who's potency was " +
                "adrenaline-dependent from moment to moment. This means Ares subjects entered a fight strong and only got stronger from there. Obviously the exact power varied, from an aura that encapsulated both the subject and their possessions " +
                "(I0273-044) to a subject that looked human but whose tissues were reinforced with a sort of carbon mesh that prevented almost any sort of tearing or rupture (I0273-053). Superhuman strength was a common feature, showing up in 91% " +
                "of cases, but regeneration, even in limited forms, has only appeared in less than 5% of Ares test subjects. It is therefore recommended that customers wishing to purchase Ares have access to proper medical capes or avoid fights with " +
                "a high likelihood for personal injury. As we often say, know yourself well. Pairing Ares with a regeneration formula is possible, but ill-advised as mixing formulas with entirely unrelated traits has a tendency to increase the " +
                "chance of deviation. Along with the other formulas named after the Greek pantheon, I0273 can be used to make a very consistent theme.","variable, common, safe, simple, self, short-range, durability, strength"));
        formulae.add(new Formula2("Heisenberg", "V7599", 9,10,8,1,9, "Named after the famous physicist, formula V7599 creates parahumans that emanate 'cosmic' ionizing radiation in 96% of tested " +
                "cases. The amount of radiation leaked seems to be inversely proportional to the number of secondary powers. The degree of control over the radiation also varies, from a passive field to a controlled, concentrated Blaster-like " +
                "power. Although their effects on the battlefield may seem underwhelming, the effects of even mild exposure to ionizing radiation can be incredibly dangerous to any form of biological life. Without proper treatment, many people " +
                "develop cancer, vision problems, even total organ failure. Many teams are ill-equipped to handle V7599 capes without serious risk to themselves, although customers should also be informed that the potency and uniqueness of their " +
                "powers may draw unwanted attention from both heroes and villians alike. Some of these people will be looking to use the powers, others to make sure the powers won't be used against them.","reliable, unique, powerful, safe, " +
                "expensive, lethal, permanent, exotic, radiation"));
        formulae.add(new Formula2("Rodin", "O3293", 8,6,3,1,5, "Those that desire to see across time should consider O3293 as at least a component of their mixture. Nearly all Rodin subjects were " +
                "able to somehow divine facets of the distant past or far future, although the exact manifestation of these abilities varied wildly. Subject O3293-002 was able to ponder on an object and accurately predict its role in the future, albeit she " +
                "couldn't predict who or what would interact with it, just that it would do X, Y, and Z before it would be destroyed. Most deviations involved an overly powerful form of the power. An interesting example was a set of conjoined " +
                "twins that each consumed O3293 at the same time. They deviated, with one only ever being able to view the past and the other only ever seeing the future. Through testing we were able to infer that they no longer sense anything " +
                "in the present moment, and all of their actions are informed only by their twin view of past and future.","reliable, safe, utility, mental, precognition, postcognition"));
        formulae.add(new Formula2("Niflheim", "U9101",7,4,4,1,5, "The production of ice and snow are the principle facets of formula U9101, named Niflheim after norse legends. Unlike J2105, Rime, " +
                "which involves lowering temperatures, Niflheim is focused on the actual creation or growth of ice crystals. Approximately 52% of the time, the ice from U9101 parahumans is more durable than traditional ice found on Earth. This " +
                "ice tends to have a slightly different chemical structure, although this varies among a subset of chemical structures. A very rare few have even demonstrated ice-like formations strong enough to sheer through steel. Deviations " +
                "tend to be rare, but extreme. Subject U9101-044's body, for example, turned into living ice. Unfortunately, their body must now be kept below freezing temperatures or they will melt. Subject U9101-081 lost all of her teeth, " +
                "having them replaced by icicles that continually grow in as they melt. She reports a constant pain as they grow in, but it goes away as temperatures drop. However, her powers do not grant her immunity to the cold so staying at " +
                "low temperatures for too long causes her to risk hypothermia.","safe, creation, environment, elemental, ice"));
        formulae.add(new Formula2("Yggdrasill", "M0744", 7,6,4,2,6,"Trees and tree-like organisms are the domain of M0744. This can manifest as nearly every power classification, from Shakers " +
                "that grow massive columns of plant material from the earth to Tinkers with artificial tree networks to Changers that morph into a sentient arboretum. Breakers are by far the rarest classification to appear. Although some " +
                "species of tree are identifiable, many seem to be bark-covered plants from ecosystems not found on Earth. Subject M0744-100 could fire dense 'prime seeds' that quickly grew into a tight thicket of blue-red branches on impact. " +
                "Although lacking root systems, these brambles seemed to survive well and thrived in helium-rich environments. Brutes from M0744 tend to often have secondary powers of regeneration on top of any durability. Unlike other regenerators, " +
                "these Brutes most often have to gain energy from a source to heal in any quick fashion. As one could have guessed, these sources continue with the plant 'theme' and most often include forms of photosynthesis or various root systems.",
                "safe, whimsical, creation, durability, utility, organic, plant"));
        formulae.add(new Formula2("Ingurgitate", "H1683",6,4,4,0,4, "98% of Breaker states from formula H1683 parahumans either passively or actively absorb one or more forms of energy or matter " +
                "from the surrounding environment. What exactly Ingurgitate subjects do with what they absorb varies: some use it to power secondary powers, some use it to heal, a few don't seem to do anything with it. The large majority " +
                "of subjects (between 77-81%) only absorb energy. When combined with other formulas, H1683's absorption effects lessen greatly, and they often apply to the other powers. A good example of this is subject H1683-Q9768-002 " +
                "who combined Ingurgitate and Pinnacle. She created weaponry that absorb a variety of forms of energy. Her masterpiece is a gun that fires grenades charged with whatever energy has impacted her suit in the last few minutes. " +
                "Pure H1683 parahumans are varied: H1683-410's Breaker state was that of a glowing, rotating tesseract that sucked in all electricity within 30 ft. to charge an explosion with a similar radius while H1683-189's Breaker state " +
                "looks almost identical to their depowered state, but all metal that touched it was instantly atomized.","safe, aura, changer, environment"));
        formulae.add(new Formula2("Kaukasios", "C2401",5,7,5,0,6, "Named after the eagle that eats Prometheus each and every day (at least according to legend), formula C2401 deals with 'states' " +
                "of being for an object. This formula is one of the hardest to understand, with even a few of the staff not knowing exactly what it does. The best way for others to understand it is just to look at examples. Subject C2401-013 " +
                "constantly resets to how they were exactly one second ago. Effectively, they haven't aged a day, gotten any more or less tired/hungry/thirsty, or been hurt since the day of they imbibed the formula. They even " +
                "reset lethal damage, although this is disorienting as their memories of death remain intact. C2401-101, on the other hand, has a Shaker/Brute/Breaker power that makes the states of others more open to change while making it harder " +
                "to change his own. If activated in a desert, for example, those around him will quickly grow overheated and thirsty while he will be able to last for days without much discomfort. While in this state C2401-089 seems more " +
                "statuesque, even becoming more emotionally apathetic. He is open to more testing and we plan to continue over the next few months.","safe, complex, utility, versatile, exotic"));
        formulae.add(new Formula2("Acerbic", "J1645",7,7,4,2,5,"Formula J1645 involves the generation and possible manipulation of acids. Over 90% of acids from J1645 subjects are incredibly " +
                "corrosive to organic material, while nearly all are at least mildly corrosive to biological life. The exact 'delivery system' of the acids comes in many varieties. Some subjects have standard projectiles like globs and " +
                "grenades while others leech it through their skin or vomit it across the battlefield. Most deviations (75%) from J1645 formulas are fatal. Subject C1645-338 (a rare, non-fatal deviation) became a constant source of " +
                "an incredibly thin, slippery acid that leaked out of his palms. Even wearing specially designed gloves don't work well as they soon fill up with acid and overflow. Customers should be aware that due to the nature of " +
                "acid and acidic damage, it is hard to become a well-known and respected hero. Many of the Protectorate teams don't want leaders with the power to melt people's faces, thus making promotion through the ranks difficult, " +
                "even if a customer's power rated as an 8 or higher. These same difficulties do not persist if a customer wishes to become a villian.","safe, terrifying, simple, elemental, acid, AoE"));
        formulae.add(new Formula2("Assimilate", "Q3682",4,7,4,1,4, "Formula Q3682 blurs the line that separates organic from inorganic. The Tinkers from formula Q3682 are a fascinating breed, " +
                "with 18% having Tinker as a secondary rating. The specializations seen in Q3682 Tinkers always involve combining disparate objects into a single, cohesive whole. Cybernetics, repurposing, and even biological technology are " +
                "common in the parahumans with a primary Tinker rating. The nearly 20% that have a secondary Tinker rating have either localized technokinesis or biokinesis and actively integrate materials into their body or equipment. " +
                "Subject Q3682-012 was one such Tinker, who specialized in genetic recombination. She was able to modify herself on the fly during combat, taking less than a minute to grow an extra set of arms. Modifying others required " +
                "laboratory equipment, but she still could sense whether a given set of recombined genes would provide the desired effects. She could even sense the genotypes of those she touched, allowing her to detect genetic diseases " +
                "(once she was given an example).","safe, versatile, inorganic, technology, organic, tinker"));
        formulae.add(new Formula2("Emissary", "Q3500",6,7,4,1,5, "Communication is the common thread in the formula Q3500. Frequencies and wavelengths, drones and modular weaponry are all " +
                "observed specializations from Emissary. Although many customers understandably believe that taking Q3500 will put them in a more supportive role, this belief is false. Q3500 capes never program a single, massive object, " +
                "but this does not mean that their smaller creations are not effective. Subject Q3500-221 had a land-oriented drone specialization that participated in project Clear Forest. An array of 124 drones was able to plan and " +
                "execute the rescue of 18 civilians from 43 insurgents without any casualities. From initiation to completion, the array's operation took 14 minutes and 58 seconds. As a different, air-oriented drone specialist, Q3500-176 " +
                "built and programmed the missile defense system for Ecuador. Emissary technology also has the benefit of being very stable, requiring less upkeep than other Tinker technology. Its effects when paired with other vials, " +
                "however, have the tendency to be... less stable, though customers needn't be too dissuaded if that's their desire.","complex, utility, versatile, multitude, long-range, tinker, inorganic, technology"));
        formulae.add(new Formula2("Tekton","Q2528",7,8,5,1,6,"'Go big or go home' is the motto of many customers that choose Q2528. This is because Q2528, named 'Tekton', creates Tinkers " +
                "who specialize in various types of large-scale projects. Specializations of all kinds inspire awe in all onlookers, many of whom cannot grasp even a whisper of the science needed to construct these behemoths. Subject " +
                "Q2528-201 and two assistants spent three months building a hangar within the mountains of Peru. Once completed, the hangar was able to autonomously create aircraft. It stayed in contact with the aircraft it created, " +
                "and modified future designs as the older models ran into problems. In contrast, subject Q2528-111 created 'backpack bombs' that, while unassuming in size, had a blast radius of nearly 3/4 of a mile. They also had the " +
                "interesting property of never harming the wearer of the backpack, leading many to fear they would be used in terroristic attacks. This fear eventually led to the assassination of Q2528-111, although the party responsible " +
                "is not known.","unique, safe, preparation, AoE, tinker, inorganic, technology"));
        formulae.add(new Formula2("Vendaval","U2210",8,5,4,2,5,"Although it can look very similar to telekinesis, formula U2210 only involves aerokinesis. Bludgeoning and slashing attacks " +
                "are the main form of offense for Vendaval capes as, unlike other U-series parahumans, it is trickier for Vendaval capes to lift large objects in the heat of battle. Most subjects that have a full U2210 formula get at " +
                "least a minor Mover rating with proper applications of their air control, although a subset have true Mover ratings through a form of flight. These secondary powers are automatic and not consciously controlled around " +
                "35% of the time. Deviations in formula U2210 are more common than in other U-series formulas, and are usually accompanied by less easily controlled powers. As far as classifications go, most Vendaval capes end up with " +
                "three or more ratings as their powers have wide applicability in combat. Trumps are the only classification never seen, with the rarest being Changers at 2% of full-formula subjects.","reliable, safe, versatile, " +
                "complex, telekinesis, environment, long-range, movement, flight, elemental, air"));
        formulae.add(new Formula2("Trésaguet","K1893",5,7,5,1,5,"100% of subjects that took a full dose of K1893 have a Mover rating. It produced Tinkers focusing on motion and transportation, " +
                "especially the creation of various modes of transportation. Although its name is taken from one of the first builders of the modern road, vehicles of sea, sky, and space are just as common. The various modes of " +
                "transportation range from personal hover-boards to massive ships capable of carrying an entire regiment. Some Tinkers produce large groups of vehicles while others only have one vehicle that they continually modify and " +
                "improve upon. Trésaguet is perfectly suited for motor heads that want to continue tinkering in their garage while also saving the world. Interestingly, mech suits, or some derivative thereof, are seen in 15% of K1893 " +
                "cases. K1893 subjects that go into hero work with the Protectorate are most often seen as secondary leaders, working as a second in command to many of the heads of leaders throughout many of the major cities.",
                "safe, movement, inorganic, technology, tinker"));
        formulae.add(new Formula2("Marksman","C7020",8,1,5,1,4,"With C7020, our scientists have created a formula that produces at least moderate Blasters 100% of the time. Nearly all " +
                "Blasters from Marksman (just below 98%) are what we would describe as 'aggressive' Blasters, i.e. Blasters whose powers' primary purpose is to deal damage. Some have secondary effects (time slows, teleportation, " +
                "etc.) but only 2% have solely utility effects. Formula C7020 is good for those customers that dream of being part of an elite, mobile strike force. Their powers rarely effect large areas, allowing for fighting " +
                "within buildings without risking its structural integrity, but are still dangerous enough to be a constant threat. The damage done is very hard to predict, with physical damage happening as often as energy damage. " +
                "Some capes can fire at multiple targets at once while the attacks of others hit harder than expected. C7020-414 was an interesting test subject who fired what appeared to be a dart of blue fire. On contact, the " +
                "blue flame erupted in a concussive blast that only affected the target it impacted. The explosion was powerful enough to send an average adult human 50 ft. through the air.","reliable, common, safe, simple, " +
                "mid-range, long-range"));
        formulae.add(new Formula2("Artillery", "C3201",7,3,5,1,5,"Reducing the battlefield to rubble is a key tactic for many customers that take a full dose of C3201. Similar to " +
                "formula C7020 (see Marksman), Artillery is designed to guarantee a Blaster rating. However, as the name suggests, if G7020 is a rifle, C3201 is a mortar round. Like a mortar round, most C3201 subjects must take " +
                "time between shots, usually with a charge up or a cooldown. Some customers have experienced powers with a sort of scaling built in, allowing the cape to release the power early for a lesser, though still " +
                "devastating, effect. Due to the lag time between shots, customers who plan on taking C3201 are recommended to attempt for a Mover or Brute power as well. Customers taking a full dose of C3201 should plan on " +
                "working with at least one partner, although a full team may be best to protect them when they are vulnerable. Duos have been quite successful, though, and customers with the right combination should not be " +
                "dissuaded. Examples of C3201 subjects: C3201-012 could pull all matter in a 25 ft. radius of her target point into a point, dealing crushing damage, C3201-079 fires slow-moving cubes approximately 10 ft. across " +
                "that deliver a scorching attack upon contact.","common, safe, long-range, preparation, AoE"));
        formulae.add(new Formula2("Tenacity","D1819",5,5,6,2,5,"Formula D1819 is one of the most varied among the D-series in terms of the powers it provides outside the role of " +
                "a traditional Brute. All D1819 subjects have at least moderate Brute traits, but their powers also seem to have a scaling trait that seems to increase with duration of combat. The exact parameter it scales with " +
                "can vary (examples include adrenaline, damage, or perceived threat level) but in general it can be assumed that they will get stronger the longer the fight goes on. This can be perfect for some, as they can " +
                "slowly overwhelm their opponents as they wear them down, while others may find this to be a disadvantage. In around 1/4 of subjects, the power level will begin to wane if combat persists for too long. " +
                "When mixed with other formulas, Tenacity seems to hold on to this scaling trait but most customers that mixed it did not receive any of its Brute traits. We are working to refine this, but it will take time.",
                "safe, simple, defensive, self, durability, regeneration, shield, strength, grab-bag"));
        formulae.add(new Formula2("Rebirth","D9644",8,7,5,2,5,"One of our newest D-series formulas, Rebirth creates Brutes that are different than the standard. Instead of opting " +
                "for increased durability, subjects that take D9644 develop a massively accelerated healing factor that allows them to heal most of the damage done to them in minutes, if not seconds. There is still commonly an " +
                "increase in strength, although increased agility is also highly common. An interesting 'deviation' seen is an adaptive factor to the healing, with the subject's body adapting to reduce damage from attacks it " +
                "is hit with in the future. Deviation is in quotes because while some customers desire it, many find the ghoulish and bizarre bodies they grow to be a problem. This is rare, however, and customers shouldn't " +
                "worry as many of these adaptive regenerators lose the adaptions within hours of leaving combat. It should be noted that combining Rebirth with other formulas often has unintended results, so customers should " +
                "keep it below 11% or above 69% of their formula for best results.","reliable, safe, regeneration, strength, agility"));
        formulae.add(new Formula2("Aquae","W3139",5,8,4,1,4,"Subjects of W3139 have powers that revolve around a phyla of predatory, amphibious, serpentine creatures and their " +
                "environment (a dark, blue-purple ocean). In the spirit of the W-series, many of the powers from Aquae are tricky to understand on first contact and require a fair amount of adjustment time. This can often " +
                "mean that a customer can expect a temporary power spike when fighting new enemies, as the enemies will almost certainly be caught off-guard. An example of a Shaker/Changer created from W3139, subject W3139-208 " +
                "created a shimmery perimeter that only appears to be a translucent veil. Upon entering however, the affected target's perception shifts and the entirety of the affected area becomes filled with a dark purple " +
                "water. Inside the water W3139-208 became a large swimming serpent. W3139-144, on the other hand, was a Striker 4 that briefly teleported her target into the black ocean, often causing partial drowning and " +
                "crushing damage from the pressure.","unique, safe, otherworldly, complex, short-range, organic, animal, elemental, water"));
        formulae.add(new Formula2("Kinesis", "U4444",8,5,5,1,5,"Pyrokinesis, hydrokinesis, terrakinesis, etc. are all present in Kinesis subjects. Although aerokinesis is seen, " +
                "customers desiring aerokinesis specifically should also examine the Vendaval formula which specializes in it. Generalized telekinesis is seen in around 13% of the time, but most subjects are restricted to " +
                "one kind of material or energy. The power level of U4444 subjects varies wildly depending on whether they have sufficient material in their area. A Blaster 8 using pyrokinesis becomes a Blaster 0 if they " +
                "have no source of fire to work with. Although a good portion of subjects are true kinetics, customers should know that many subjects only have a few moves that they can quickly and routinely use in combat. " +
                "The originality and power levels of subjects also vary based on their material/energy manipulated and the maximum they can control at one time (both in sheer amount and number). Manipulating diamond would " +
                "definitely score 10 for originality, but it would effectively have a power of 0 due to diamond's rarity in large quantities. On the other hand dirt is much less durable and more common, but a customer can " +
                "realistically always expect to have dirt on hand. Unlike some other U-series formulas, line of sight to manipulated material/energy is usually required for Kinesis parahumans.","unique, safe, utility, " +
                "versatile, environment, elemental, fire, water, ice, stone, metal, air, AoE, telekinesis"));
        formulae.add(new Formula2("Weevil","M3061",7,7,4,2,5,"Arachnophobes and those squeamish around insects should avoid formula M3061 at all costs. Bugs, insects, arachnids, " +
                "and anything that skitters through the shadows falls under the domain of Weevil. Movers, Changers, Masters, and Brutes make up the vast majority of M3061 subjects. Insectoid morphology from this planet and " +
                "others made repeat appearances throughout testing (wings, chitin, mandibles, etc.). Mover ratings usually result from flight or greatly increased climbing ability and as such tend to remain on the lower end " +
                "of the spectrum while Changers and Masters are usually among the strongest M3061 subjects. Because the general population is uneasy at seeing most M3061 capes in the field, villains tend to drift toward this " +
                "formula more often than heroes, but this is not a hard rule. Subject M3061-313 projected a telekinetic chitinous armor and demonstrated increased strength and became a promising member of the Protectorate " +
                "until their untimely death during a building collapse eight months into their career.","safe, organic, animal, flight, changer, master, strength"));
        formulae.add(new Formula2("Narcotic","Z0420",8,9,3,1,5,"Subjects of Z0420 almost always secrete some form of a pharmaceutical drug that affects at least humans, if not " +
                "all animals or organisms. Most subjects produce 1-3 unique substances, although most that create more than that have at least a few that are non-reactive to other organisms. Around 30% of the drugs produced are " +
                "psychoactive in nature, producing hallucinations or confusion in their victims the majority of the time. Unlike most other formulas, we recommend and encourage customers to mix Z0420 with other formulas to " +
                "reach their full potential and help channel the creation of the power into a direction they want. Otherwise, the secondary powers of Z0420 may often eclipse the drug-related power(s). It is counter-intuitive, " +
                "but mixing in another formula tends to bring out the core Z0420 powers and make it seem as though it is still a full Z0420 mixture.","reliable, unique, safe, formula modifier, creation, versatile, " +
                "others, organic"));
        formulae.add(new Formula2("Oculus","N2349",9,8,4,1,6,"Being one of the few formulas that revolve around human anatomy, all powers in N2349, as the name Oculus suggests, " +
                "involve eyes, eyesight, and/or eye contact. Many of the powers are incredibly devastating when unleashed, although once enemies are aware of the line-of-sight or eye contact restrictions, activating or " +
                "landing them are much more difficult. Causing mind control or immolation on eye contact are both powers seen from Oculus and netted the customers PRT ratings of Master 8 and Blaster 7 respectively. Most " +
                "common deviations still remain around the eyes, whether a glowing effect or a massive growth in size of the eyes. Around one quarter of deviations also involve sprouting multiple eyes on various parts of a subject's " +
                "body, which becomes a great boon in combat as they can make eye contact and see in almost every direction. As for secondary powers, formula N2349 seems to correct most known vision problems including complete " +
                "blindness and near/far-sightedness and can provide even mildly better vision than the average human.","reliable, unique, safe, long-range, sensory"));
        formulae.add(new Formula2("Vision","O3269",8,7,5,1,6,"Images of the future are the common thread throughout O3269 formulas. Often times these only appear inside " +
                "the subject's own head, but in around 28% of patients these visions are visible, at least in part, by others. The appearance of these visions was neigh unpredictable by our scientists, with subject O3269-022 " +
                "actually being invisible and people only ever seeing him in flickering images of what he was going to do or had already done. The visions of formula O3269, like all precognition capes, must be taken with a " +
                "grain of salt because even knowing about the future is liable to change it. Most subjects also have hard limitations on what their powers, either controlling the number of visions, the length of the visions, " +
                "or how far into the future each vision takes place. We recommend that any individual that wishes to drink a 100% O3269 mixture signs up for our Cape Combat Survival course and Basic Firearm & Martial Art " +
                "course prior to imbibing their mixture to increase their odds of a combat-ready power. The more combat training any one patient receives, the more effective their power seems to be in combat.",
                "reliable, safe, mental, precognition, utility, preparation, versatile, sensory"));
        formulae.add(new Formula2("Sandman","G2800",6,9,4,0,7,"G2800, as a formula, has a 100% chance to involve sleep and a 68% chance to involve memory loss (mostly retroactive). " +
                "The memory loss is usually very minor compared to that caused by other mentally-oriented capes and usually only occurs if a target falls asleep under the affect of a G2800 subject. A Stranger rating is almost " +
                "guaranteed from Sandman. Subject G2800-012 has an aura that slowly puts those in the area to asleep. Over a period of time, people begin to suddenly fall asleep and over time they do so at a faster rate. " +
                "Reports from testers of this power state individuals become understandably distressed upon seeing others rapidly falling asleep, but if they too fall asleep they remember none of the events prior to coming " +
                "under the effects of the aura. G2800-056, for contrast, could fall asleep at will and projected a body of a chosen person, indistinguishable from the target, even if she had only briefly glimpsed them once. " +
                "Overall, G2800 aren't terribly applicable in combat, but are nearly unparalleled in espionage.","unique, safe, whimsical, utility, aura, others, mental, stealth, master"));
        formulae.add(new Formula2("Neo","X1111",7,10,5,1,8,"Named after the movie series 'The Matrix', this formula often have subjects that play with parts of reality itself " +
                "as if it were putty. Walking up stairs no one else sees, walking through a door in Siam only to appear moments later in Russia, developing memories of things that never happened, all of these are seen in " +
                "formula X1111. Our scientists' best guess as to how these powers are interlinked is that they are all some form of dimensional manipulation. The breakthrough came with subject X1111-401, a man with the " +
                "ability to see the 'neighboring' dimensions as a series of phantom worlds that overlay this one. With physical contact and focus, he can pull objects from these realities into ours, or push from our " +
                "version of the world to theirs. He was limited in that large objects other than humans were difficult to transfer and even after weeks of testing he could not transfer himself, thus limiting our reach " +
                "into other 'realities' to the two he could see. He is now an invaluable addition to our staff, helping us to hide what needs to be hidden and dispose of things if they get in our way.",
                "unique, safe, expensive, complex, versatile, exotic, dimensional"));
        formulae.add(new Formula2("Colossus","H0133",8,6,4,1,5,"For those that don't mind, or even desire, becoming a career cape, H0133 is a great formula to make a splash " +
                "in the cape scene. It is a changer power who's main theme is expansion and large size. Colossus subjects live up to their name, often towering 25 ft. or more on the battlefield. Around 31% of subjects " +
                "develop a 'full' human transformation and appear similar to a normal human, just much larger. In an interesting twist, nearly 40% of these large humans do not look like the subject from which they spawn. " +
                "Those subjects that do not fall into this 'full human transformation' category are most likely partial human transformations or non-human transformations. Partial transformations, the most common, involve " +
                "the expansion of body parts or full transformations only very briefly, while still maintaining a humanoid form while non-human transformation are usually full transformations, but the form is inhuman. " +
                "Examples of non-human transformations include H0133-013 and H0133-016 who grew into a bone-plated snake and a spike-covered bovine respectively.","reliable, safe, size, simple, changer, strength, " +
                "durability"));
        formulae.add(new Formula2("Explanation","S2375",8,8,2,0,7,"No subject lacked at least one power that was Trump/Thinker in nature and involved somehow analyzing, " +
                "detecting, or examining powers themselves. Though often overlooked, we have many documented accounts of these powers saving lives in the field and making life easier for capes back home. Quick analysis " +
                "of an enemy power can help prepare a team for the enemy's plan of attack and help avoid making novice mistakes. Detecting powers early has also saved many a life and vastly helps against Stranger and " +
                "subtle Master effects that often have no counter. On the more domestic side of things, you may have already met, or will meet, a cape who works for us named Oracle. She wears a toga and an ornate golden " +
                "mask and is a S2375 success story. She claims to have the ability to tell the 'true purpose' of any given parahuman which can help us determine what the powers of a customer or subject is without much " +
                "risk. She can only describe them in riddles, like the oracles of long ago, but our team has become adept at deciphering them since bringing a specialist on board. She has even helped us teach a Changer " +
                "how to revert to human form when we initially believed he was just a deviant. To use a team's powers to the fullest or find every weak point in the enemy's, customers should choose formula S2375.",
                "reliable, unique, safe, power-affecting, mental, sensory"));
        formulae.add(new Formula2("MacGyver","Z9919",6,9,4,1,6,"Subjects from Z9919 run a fine line between Tinker and Thinker, building tools that serve only a temporary " +
                "purpose in most cases, but definitely building something. Specifically, they often combine or use objects in such a way that they don't exactly become a cohesive whole, but they do the job required. " +
                "Think of them as someone who lacks functional fixedness altogether and can find the unique properties in anything. Subject Z9919-009 is a perfect example of this. During testing, he rewired a fridge and " +
                "a jackhammer to create a freezer and successfully fought through three trained soldiers using only a banana and some string. Secondary powers are also quite common and combining Z9919 with other formulas " +
                "almost guarantees they will grant the subject two distinct powers instead of fusing as is common with other formulas. These powers are greatly amplified if they to are object-oriented, but this needn't " +
                "be the case.","unique, safe, formula modifier, tinker, mental, temporary, complex, versatile"));
        formulae.add(new Formula2("Terraform","U7663",8,4,5,1,5,"The landscape seems to change around subjects that imbibe the formula U7663. This affect can be active or " +
                "passive, always on or easily controlled, have a range of 2 inches or 2 leagues, but it is always present. This aura or effect has a heavy tendency to affect the ground and terrain, but it is not unheard " +
                "of for it to affect man-made structures and even the local wildlife from time to time. Even a handful of instances demonstrate the power affecting the clothing and possessions of individuals in an area. " +
                "However, this power has never been demonstrated to affect other humans directly in any form. Examples of U7663 subjects are as follows: U7663-012 had an active power that caused a localized avalanche and " +
                "a passive aura she could toggle on and off that slowly rose the earth around her to always give her the high ground. It appears this aura maxed out after growing a hill approximately 40 ft. tall over the " +
                "course of a minute. U7663-101 had near-terrakinetic abilities that, among other things, passively pulled up slabs of stone to absorb incoming fire and an active ability that could draw magma from beneath " +
                "the rocks in a slow gurgle.","reliable, safe, environment, aura, inorganic"));
        formulae.add(new Formula2("Imagine","Z1998",5,5,6,1,6,"Daily meditation is key to maximize the power of formula Z1998. Subjects describe it as a feeling of open " +
                "potential and after their meditations, lasting from several seconds to several hours, they feel as if that potential has been used. They focus on how they wish to improve and overtime their powers help " +
                "them do just that. When taken alone, Imagine tends to give few extra powers and instead focuses on improving the subject's physical and/or mental attributes. In some subjects this appears as just overall " +
                "improvement (higher IQ), while others it is much more specific (rapidly increased mathematical computation). When combined with other formulas, Z1998 often creates powers that are terribly underwhelming " +
                "directly after the trigger event, but over time the Imagine improving effect turns them into some of the most powerful and personalized powers we have ever seen. Because of this, we encourage our customers " +
                "to consider adding formula Z1998 to their mixture if they have room.","safe, formula modifier, temporary, preparation, self, mental, skills"));
        formulae.add(new Formula2("Nightmare","V0000",8,10,8,2,9,"Targets killed by formula V0000 subjects are always found to be brain dead with no known biological cause. " +
                "This, and the violent hallucinations that precede it, are the only offensive outcome of consuming a V0000 formula. The delivery method varies, but the effect remains the same. The most common delivery " +
                "methods are touch, proximity, and gaseous miasma. Although visions and brain death are the only offensive powers, Brute powers of durability and/or regeneration have been noted. The V0000 without " +
                "incredibly overt delivery systems make great assassins, with untrained doctors assuming their victims died from a stroke or aneurysm. Customers should be aware that the public does not very much favor " +
                "capes who's powers can only be used to brutally murder others, and as such they will become a priority target of the PRT when and if their presence becomes known. Also, of the 300+ subjects we have " +
                "tested, exactly 1 subject has a power the Thinkers contracted on our staff believes has a >90% chance to successfully become a Protectorate member, so customers who desire to be a hero should probably " +
                "avoid V0000.","reliable, unique, powerful, safe, expensive, terrifying, lethal, mental"));
        formulae.add(new Formula2("Venom","V3178",6,4,5,2,4,"Incredibly potent toxins are the baseline for V3178 subjects. The potency is astounding, with nearly all toxins " +
                "taking full effect in seconds. Of the toxins that don't immediately kill their targets, permanent bodily harm and/or complete paralysis are not uncommon. Spores, claws, fangs, needles, etc. are all " +
                "secondary powers that help disperse or deliver the toxins to their victim(s). Minor regeneration is common, but other secondary powers are rare. These secondary powers always deal with biology and V3178 " +
                "has not yet produce any capes with any powers that can effect inorganic material. This makes Venom incredibly effective against organic targets but nearly ineffective against targets that are mostly " +
                "inorganic (such as some Brutes and many Tinkers. Only V3178 subjects that have control over the potency of their poison and venom will be able to be considered for roles in the PRT. Like other V-series " +
                "formulas, Venom customers should be aware that if their lethal tendencies become known, they will become a priority target of the PRT.","common, safe, lethal, terrifying, organic, regeneration"));
        formulae.add(new Formula2("Follicle","M3438",8,7,3,1,5,"Hair, nails, and on rare occasions teeth are the primary tools of M3438. Hardening far beyond normal bounds " +
                "is a common occurrence, and often the first powers customers will associate with formula M3438, but saying that is the only outcome would be a blatant falsehood. Powers similar to the hardened nails and " +
                "teeth include subject M3438-108 who could replace his fingernails with glowing facsimile that could sear through most any material. The current working theory put forth by our scientists is that he keeps " +
                "hydrogen and helium atoms in a state of fusion and fission to constantly generate the massive energy output. Manipulation of hair and nails is also seen, both in the more traditional 'Medusa-like' and " +
                "more... exotic. An example of this phenomenon is M3438-124 who had a passive aura that grew out people's hair and gave her a sort of telekinetic control over it. She only needed proximity to work, not " +
                "line of sight, and therefore distance or a complete head-to-toe body wax were the only effective defenses against her in combat.","reliable, safe, organic, self, short-range, mid-range"));
        formulae.add(new Formula2("Polyform","H1605",8,7,5,1,6,"Every Breaker subject produced by Polyform had two or more forms (not including a default human state if " +
                "present), each with their own unique set of powers. These forms tended to be on the extreme ends, with Movers that could only move in a straight line or Blasters that couldn't move at all. A truly " +
                "versatile powerset, understanding when to adopt each form appears to be the key between an average Polyform subject and an exemplary subject. A few subjects did not receive Breaker ratings as a main " +
                "power, this includes a Tinker (subject H1605-091) who's main achievement is a suit of armor that shifted between a mobile flight form and a durable land combat form. Other creations include a rifle " +
                "that could shift into a solar charger for the suit and a cellphone that could be detonated as a hand grenade. Instead of making a completely integrated powerset, it seems that formula H1605 prefers to " +
                "give more potent and vulnerable forms to the subject and let them figure it out for themselves. In short, H1605 = multiple forms. Interactions with other formulas have intrigued our scientists, but no " +
                "pattern has yet emerged. We are so eager to study this phenomenon that customers who combine H1605 with only one other formula are liable for a price cut on their final mixture! Talk to our staff if " +
                "you are interested.","reliable, safe, changer, multitude, complex, versatile"));
        formulae.add(new Formula2("Limitless","S9020",8,10,5,1,8,"This formula is perfect for any customer who cannot decide on what type of powers they want. The average " +
                "S9020 cape has a series of 'spaces' they can fill with powers in a variety of ways. Some 'download' powers from other parahumans in close proximity over time while other S9020 subjects seemingly manifest " +
                "powers at will. Most Limitless capes fall into one of two categories, although there are many notable exceptions. Category one powers allow the subject a large amount of control over what kind of power " +
                "shows up but are slower to appear, weaker, or clunkier than category two. Category two, on the other hand, displays a higher degree of unpredictability but represents powers that are immediately usable " +
                "at full power. Category two powers also seem to reward unpredictability, with our more clever subjects that use powers in surprising ways being 'rewarded' with more powerful abilities. The reverse is " +
                "true, though, where subjects that repeatedly use powers in the same way find themselves with progressively weaker powers. In conclusion, Limitless is the formula for customers who want to experience all " +
                "types of powers, but never hold them for too long.","self, safe, unique, safe, expensive, versatile, temporary, power-affecting"));
        formulae.add(new Formula2("Static","S4342",7,5,2,0,5,"Disruption is the name of the game for S4342 parahumans, and they play the game well. Many powers affected by " +
                "S4342 capes become very unpredictable, even to the owners of the affected powers. Some powers begin firing off randomly, some powers lose and gain range, magnitude, control, etc. for seemingly no reason " +
                "at all, some powers even stopping to work entirely. Although these can be potent effects, they often throw the battle into chaos that even the Static cape's team cannot predict. However, Static powers " +
                "override other Trump powers 87% of the time and therefore are, in a sense, the Trump card of Trump cards. Formula S4342 is relatively weak on its own, and it is recommended that customers mix it with " +
                "another formula(s) if possible. Interestingly, formulas with Static in them do not require the Balance formula to decrease the risk of deviation.","safe, formula modifier, power-affecting, utility, " +
                "others"));
        formulae.add(new Formula2("Giver","S1010",7,7,4,1,6,"Temporarily gifting powers to themselves and others is the hallmark of formula S1010, aptly named Giver. These " +
                "powers run the gambit from more 'traditional' powers such as flight, durability, strength, pyrokinesis, etc., to more unique powers such as complete immunity to the effects of other powers or inability " +
                "to become tired. For obvious reasons this formula is best for customers that plan on working as part of a team, as solo rogue work, either vigilante or otherwise, will be quite complex if the customer " +
                "receives a power that only grants powers to others. Granting powers to oneself is a little more nuanced, with subjects somewhat choosing from a fixed set of powers or randomly having one 'chosen' by the " +
                "power itself. For customers interested in this second kind of parahuman ability (gifting oneself with powers) we recommend you examine formula Z9020 (named Limitless) as it provides a very interesting " +
                "version of this with great regularity. Most S1010 parahumans(94%) that gift powers to themselves still retain the ability to give these powers to others in some capacity, although usually one suite of " +
                "powers (personal or for others) is markedly more powerful, although exceptions has appeared...","safe, versatile, temporary, others, power-affecting"));
        formulae.add(new Formula2("Pristine","Y5143",9,7,0,0,5,"Formula Y5143 slowly improves the appearance of the subject over time. These changes would be ranked as a " +
                "Changer 0, meaning they are actual, physical changes and not tricks of the mind. These changes can include removal of acne and acne scars, improving bone structure, regrowth of hair, etc. The personal " +
                "feelings of subjects tend to be the driving factor that determines what classifies as 'attractive'.","reliable, safe, recreational, self, preparation, permanent"));
        formulae.add(new Formula2("Sterile","Y3284",10,4,1,0,5,"The only power formula Y3284 provides customers is a toggled disinfecting touch. This is a very niche " +
                "formula that is, understandably, only valuable to a select few customers: germaphobes and people working or living in close proximity to people with compromised immune systems. The disinfecting ability " +
                "kills off all bacteria, viruses, and fungi and is undetectable after use. It has no effect on animals or plants larger than 1 cm in size, and larger fungi are much slower to die, with the largest being " +
                "effectively immune to it.","reliable, safe, recreational, organic, utility"));
        formulae.add(new Formula2("Harpy","J7169",7,6,4,2,5,"Screeching sonic attacks accompany or dominate any powerset provided by formula J7169, named Harpy. These sonic attacks " +
                "are incredibly varied in power, duration, and area of effect, but all can be potent, given proper training. Master and Stranger abilities are much more common in J7169 than in other J-series formulas, but this, " +
                "like anything dealing with the manifestation of powers, is by no means a guarantee. Customers should consider Harpy if they want to strike a particular kind of fear into their opponents. Sonic attacks are unlike " +
                "other energy attacks in that it is hard to pin down the exact direction they are coming from. If a J7169 subject can remain hidden, they can often whittle down their opponents without having to enter open conflict. " +
                "Piercing or slashing damage also commonly augments powers more inclined to direct combat, but quickly become very rare among those powers that have much higher versatility or variety. For customers that are " +
                "considering multiple formulas: you should be aware that although Harpy provides a massive variety of powers, it does not combine well with other formulas and will markedly increase the chances of deviation if " +
                "mixed.","safe, elemental, sound, master, long-range, stealth"));
        formulae.add(new Formula2("Elevate","N2019",8,2,4,1,5,"Heightened hearing, sight, touch, taste, and/or any of the various senses humans have is what formula N2019 provides. " +
                "This effect can appear as multiple small bonuses across many senses to one major increase to senses that only appear under specific conditions or that only sense certain things. A prime example of this third " +
                "kind is subject N2019-510, a female child who could hear all the actions, speech, and movement of any and all parahumans within one mile of her. She did not need to know beforehand that they were a parahuman, " +
                "that small Trump-type feature seemed to be covered by her power. Other examples include a subject (N2019-043) with a faster reaction time only when directly threatened by incoming projectiles. Catching baseballs, " +
                "falling stones, etc. did not 'count' as threatening and therefore their power did not provide them with the boost to reaction time. Overall, Elevate is a stable and very useful powerset that is a good formula " +
                "to mix with others to add more versatility to a power loadout.","reliable, common, safe, sensory, simple, utility"));
        formulae.add(new Formula2("Muffle","G6671",5,5,5,1,5,"Targets of powers manifested from formula G6671 always have their senses lowered or nullified. A rare few even lose " +
                "the sense for days at a time, or lose it permanently. Sight and hearing are the most likely to be affected (muffling taste isn't very applicable), but interesting quirks of powers sometimes affect lesser senses " +
                "like taste. Subject G6671-002 had an aura that blinded all people within 20 ft. but it also made any food taste like strawberries to the affected individuals for 10 minutes afterward. Some of the powers only " +
                "affect others' senses in relationship to the power's user. This can even extend to actions that the subject takes: Subject G6671-109 always silenced any actions they took, even tossing silverware down a flight " +
                "of stairs without anyone on the floors above or below hearing anything. This affect seemed limited to their direct actions only, if they rolled a bowling ball into another bowling ball, the first impact would " +
                "be silent, but the second bowling ball colliding with a set of pins would be heard as normal. This led to Subject G6671-109 preferring to use knives at night to maximize their effectiveness without risking the " +
                "sound of bullets flying through the air and ricocheting.", "safe, stealth, mental, sensory, mental, utility, versatile, aura"));
        formulae.add(new Formula2("Eidetic","P5050",9,2,4,1,5,"Formula P5050 will always improve a subject's memory and recall abilities. The outcome and practical usage of these " +
                "improvements varies, and customers often do not realize that Eidetic parahumans can become quite powerful. Some P5050 subjects keep with the expected Thinker vein, subject P5050-051 could memorize a person and " +
                "their body language within seconds, easily seeing through our best attempts to disguise volunteers or coach them to lie. P5050-051 could even tell when volunteers weren't exactly sure if the information that had " +
                "been given was 100% accurate. Other Eidetic capes, however, have more versatile applications, filling a Tinker, Striker, or nearly any of the other classifications, sans Master and Breaker. Subject P5050-100 is " +
                "a master of over 20 martial arts as her body has perfect muscle memory, she need only complete a movement once and she can flawlessly repeat it instinctively. This has led to her having an approximate rating of " +
                "Striker 4, Mover 2, Stranger 1 and allowing her to succeed as a 'non-powered' spy for the American government.","reliable, common, safe, mental, processing, simple, utility"));
        formulae.add(new Formula2("Amphibion","Y3312",10,8,1,0,4,"This formula gives subjects the ability to breathe underwater and/or hold their breath for hours on end. Our staff " +
                "have rigorously tested and refined this formula so that less than 0.02% of the final test subjects showed any sort of outward physical change. Internal structures such as air sacs, more alveoli, etc., however, " +
                "are quite common and customers should be aware that having medical examinations may become complicated if they desire to retain a non-powered guise. Obviously, formula Y3312 is best for customers living on a " +
                "large, relatively private, body water or with access to such a place. Actively swimming without at least the appearance of a SCUBA in deep water or for long periods of time is sure to draw attention.",
                "reliable, unique, safe, self, water, simple, permanent, water"));
        formulae.add(new Formula2("Lilliput","W4067",8,5,4,1,5,"Seeing the world grow around you is said to bring about images of the Nisse, Gulliver's Travels, Alice in Wonderland, " +
                "or any number of fairy tales. Like those stories, subjects of formula W4067 shrunk, becoming only a fraction of the size of a normal human. Some subjects had this as seemingly their only ability, while others had " +
                "a vast array of abilities. The most interesting version of this is a Tinker (subject W4067-606) who could only shrink while absorbed in his work. He barely noticed the effect and often didn't even realize it had " +
                "taken place as he ran in and around his machines, connecting and wiring the hardware. Another key point of the power is conservation of mass and momentum: some subjects have it, most do not. Subjects that have it " +
                "tend to be lacking on other strong powers, though not to their disadvantage. Subject W4067 had a minor durability power that he used to become a living bullet, dashing at a target and shrinking for only enough " +
                "time to slice through the target's body.","reliable, safe, whimsical, versatile, stealth, self, size"));
        formulae.add(new Formula2("Siren","K8088",7,7,4,1,5,"Customers who are singers (or who wish to be) should seriously consider formula K8088. If the name 'Siren' wasn't enough " +
                "of a tip-off, formula K8088 creates powersets centered around the subject's voice. Siren powers that affect organisms must be able to be heard while powers that affected inorganic matter must just be hit with the " +
                "sound waves. Some formula K8088 subjects use subsonic or supersonic sound waves that can't always be heard, but the same requirements still apply. The most effective defense against an K8088 parahuman is " +
                "soundproofing, distance, or incapacitating the subject's ability to talk/sing. The capes from K8088 do, though, have a distinct, rarely considered, advantage to their vocal powers. Because their sound wave's needn't " +
                "be aimed, many Siren subjects can affect targets around corners, behind cover, or even entirely undetectable to their senses. This can throw off even the most seasoned strategists and give their team a concrete " +
                "advantage. Siren often combines in interesting ways with other powers, sometimes even losing a vocal component entirely.","safe, long-range, AoE, sound, organic, inorganic, formula modifier"));
        formulae.add(new Formula2("Eleventh Hour","X1515",8,7,5,1,6,"Eleventh Hour capes are very much like parahumans from the W-series formula Dilation; they manipulate time. The " +
                "only difference is that while Dilation capes can have offensive, defensive, or utility powers, Eleventh Hour capes rarely, if ever, develop offensive abilities. Like time powers are often predicted to be, Eleventh " +
                "Hour capes have a plethora of bizarre, hard to comprehend powers that require much time and practice to utilize well. Some formula X1515 customers and subjects have developed there skills in such a way that they " +
                "have even found offensive uses for their powers, often increasing their threat rating drastically. This offensive adaption is rarely accomplished solo, and usually requires at least one other parahuman's cooperation " +
                "to work. For example, a subject from another testing batch had a self-destructing power and subject X1515-236 could 'reset' a person to their status from seconds ago. Instead of the exploder taking minutes to " +
                "regenerate, she was able to continually detonate, moving her and subject X1515-236 from a Blaster 5 and a Brute 2 to a Blaster 8 and a Brute 5 respectively (when paired together). Other Eleventh Hour powers involve " +
                "slowing down attacks, increasing an ally's dodging speed, or creating fields of unequal time to 'curve' projectiles.","reliable, safe, exotic, time, defensive, utility, complex, versatile"));
        formulae.add(new Formula2("Ursine","B3847",7,5,5,2,5,"Bears. Need we say more?","safe, theme, simple, animal, versatile, short-range, force field, changer"));
        formulae.add(new Formula2("Titan","L7192",6,3,8,9,6,"Powers of the elements abound among Titan subjects. Unfortunately, severe deviations accompany nearly every dose of " +
                "formula L7192. Named after the Titans of Greek mythology, formula L7192 has demonstrated the ability to grant powers revolving around all of the basic elements (fire, earth, water, air) as well as plant material " +
                "and rarer natural phenomena (gravity, space, time, etc.) around 10% of the time. Serious deviations vary, but include an increase in size, lack of control, and grotesque transformations of the subject's body " +
                "and/or mind. The deviations tend to follow patterns dictated by the nature of the predominant element, but not always the case. Customers should note that over 1/3 of subjects had more than one element in their " +
                "powerset, some switching between while others controlling seemingly all of them at once. Subject L7192-113 passively created a field of massively increased gravity within 20 ft. of them, sometimes leveling " +
                "buildings only by proximity. When paired with their potent pyrokinesis (unaffected by gravity) they became a B class threat, being rated a Shaker 9. They also developed an incessant need to burn anything " +
                "affected by their gravity aura. Personal accounts from the subject claim it was virtually impossible to suppress.","common, powerful, deviant, simple, versatile, elemental, exotic, AoE"));
        formulae.add(new Formula2("Serpentine","V0009",8,8,4,2,6,"Eyewitness accounts of V0009 subjects in the field describe them as appearing boneless in their movements, deftly " +
                "avoiding attacks by mere inches with a cool, almost predatory, ease. Formula V0009 produces this improved agility and flexibility in nearly all subjects but the secondary powers are where this formula shows its " +
                "diversity. Regeneration, venom, poison, constriction, elasticity, extra senses, claws, fangs, prehensile tails and tongues, enhanced climbing abilities, camouflage and so much more have all been seen in " +
                "Serpentine subjects. The name for formula V0009 does seem fitting as most formula V0009 subjects do resemble snakes or lizards in behavioral mannerisms. The similarities are close enough that many people with " +
                "ophidiophobia (fear of snakes) are at least mildly disturbed by the presence of an actively powered V0009 cape. This uncanny resemblance, when paired with the near-universal negative reaction to serpents, is why " +
                "Serpentine was put into the V-series. Although formula V0009 will fit well on a V-series-based parahuman team, they are subtle enough that, with the right theming, they can fit into a normal team as well. The " +
                "same cannot be said for other V-series formulas like Cadaver or Sanguine.","reliable, unique, safe, animal, terrifying, short-range, agility, regeneration"));
        formulae.add(new Formula2("Excalibur","R1111",8,5,4,0,5,"A single item or small set of items is always the focus of a R1111 parahuman. Over time they form a 'bond' with a " +
                "single item and their powers while wielding/wearing/using the item increase with the bond. The powers and items used cannot be predicted well, some subjects have only specific kinds of items to use (subject " +
                "R1111-032 could only use swords) while others can use nearly any kind. The bond sometimes grows over the course of a moment and is lost as soon as the item is dropped while other times it sticks around until " +
                "the item is destroyed. Because the items used cannot be predicted, it is best for customers to hold off on theming their parahuman identity until after triggering and testing their powers. This formula works well " +
                "when combined with others and works for solo or team-oriented customers. An all around solid choice.","reliable, safe, object-oriented, formula modifier, singular, preparation, versatile"));
        formulae.add(new Formula2("Bestow","R8740",8,6,4,1,6,"As the name suggests, Bestow subjects grant abilities to objects. These abilities are immediate and full-power upon " +
                "manifestation, requiring no charge-up time. Most formula R8740 subjects have a limited pool of abilities they can bestow onto items, those with a strong secondary powerset may only even have one, but the number " +
                "of available powers tends to grow over time. Subject R8740-068 described it as a grid of various powers, while R8740-002 said she saw various spirits that inhabited her targets. The range of this gift-giving " +
                "power changes from subject to subject, but touch is the most common and no range further than 100 ft. has been seen. Duration of these effects cannot be predicted, and even among powers given by a single " +
                "subject, it can vary wildly. This formula is the best in the R-series for spontaneous customers without being a terrible formula for those that wish to plan ahead either.","reliable, safe, object-oriented, " +
                "power-affecting, utility, versatile, short-range, mid-range, temporary"));
        formulae.add(new Formula2("Wraith","G1234", 7,7,5,1,6,"Intangibility, in some form, is the hallmark of formula G1234. Although not always applying it to themselves, intangibility is often a bizarre power " +
                "when Wraith subjects bring it onto the battlefield. Unlike other forms of damage reduction, seeing objects pass through another individual has often been described as deeply unsettling. In more covert operations, " +
                "G1234 subjects can often phase through most types of defenses, almost always requiring a Trump cape to be present to insure any compound was safe from them. Attacks from offensively oriented Wraith parahumans are " +
                "also quite deadly, flying through armor only to materialize inside the target's body. The exact method of this ability is not known, although some scientists on our staff hypothesize the subjects are 'smearing' " +
                "themselves across several dimensions as they are rarely entirely immune to things happening in our world. Supporting evidence of this theory: strong deviants often react to things that aren't there, including holding " +
                "conversations with no one and walking up stairs that no one else can see or touch.","safe, stealth, movement, exotic, utility, versatile"));
        formulae.add(new Formula2("BASE: TRANSFORMATION", "Z0000",10,1,1,1,5,"The basic transformation formula, when mixed with another formula, nearly always(98%) grants a Changer or Breaker power. This " +
                "formula becomes highly volatile (Deviation: 10) if taken alone but strangely does not affect deviation chance if mixed. 15% of a customer's mixture should be BASE CHANGER, if desired; more increases likelihood " +
                "of deviation and less decreases chances of a transformation power.","reliable, common, safe, changer, formula modifier"));
        formulae.add(new Formula2("RELEASE RESTRAINT","Z9080",10,10,10,8,8,"Formula Z9080 should always be paired with at least one other formula and we highly recommend Balance " +
                "being included in any formula involving Release Restraint. The entire purpose of RELEASE RESTRAINT is to help powers manifest without a Manton limit. These powers are often the most lethal of all formulas, " +
                "allowing one-hit kills of most capes, including many Brutes. The best defense for non-Manton-limited capes are avoidance or elimination. Customers should be warned, however, that formula V9080 does have a relatively " +
                "high deviation rate and with mixing this will increase further. Around 25% of subjects deviated, even when combining in the Balance formula.","reliable, unique, powerful, deviant, expensive, lethal, formula " +
                "modifier"));
        formulae.add(new Formula2("Pocket","X8088",5,8,5,1,6,"Dimensional manipulations, especially those dealing with pocket dimensions, is the defining feature of X8088. The " +
                "possibilities are too numerous to list here, but the functionality of any given powerset varies based on the number of dimensional 'doors' a subject can open and to where these doors open. Subject X8088-501 " +
                "could open only one portal, but it opened into a high-pressure aquatic environment. She used this to blast enemies with jets of water. This jet had enough force to push a car along a parking lot, albeit slowly. " +
                "Subject X8088-212, on the other hand, had a reactionary that summoned twin dimensional holes to send potentially dangerous objects from one side of the subject to the other. Organic targets would be teleported " +
                "as well, although it was too quick for volunteers to sense the pocket dimension used.","unique, safe, exotic, dimensional, versatile, complex"));
        formulae.add(new Formula2("Robin", "B1919",8,6,4,1,6,"Striker (and other very close range) powers with a focus on kinetic and explosive attacks. Some patients have a brief time-delay on their powers, but " +
                "no power has any single effect that lasts more than 6 seconds. In most cases, these powers work best when paired with a striking martial art although some outliers do exist. Patient B1919-044 sent objects rocketing " +
                "off whichever direction he was facing. His projectiles reached speeds of 180+ km/h and flew for four seconds or until they impacted another object. Patient 044, interestingly enough, could move objects up to the " +
                "size of a car but couldn't affect a second object while the first one was still moving. Customers shouldn't be worried about wounding themselves with their power, throughout 113 treatments of Robin, it has never " +
                "occurred.", "reliable, safe, short-range, kinetic, fire, versatile"));


        Collections.sort(formulae,Formula2::compareTo);
    }

    private void initializeKeywords()
    {
        //keywords that describe the look/feel of the power-------------------------------------------------------------

        keywords.add("terrifying");     //Powers that are disconcerting to watch
        keywords.add("otherworldly");   //Powers that are otherworldly to look at
        keywords.add("whimsical");      //Powers that evoke whimsy
        keywords.add("theme");          //Powers with a theme
            keywords.add("Olympic");    //Powers in the Olympic Pantheon series

        keywords.add("recreational");   //Powers that are more recreational than traditional useful

        keywords.add("simple");         //Powers that are easy to understand and use
        keywords.add("complex");        //Powers that are difficult to understand and use

        //keywords about the general use of the power-------------------------------------------------------------------

        keywords.add(" ");
        keywords.add("formula modifier");       //Special formula used to modify outcomes of other formulas

        keywords.add("creation");       //Powers that create things (non-Tinker)
        keywords.add("grab-bag");       //Grab-bag capes
        keywords.add("telekinesis");    //Telekinesis; self explanatory

        keywords.add("utility");        //Powers that provides indirect benefits in combat
        keywords.add("defensive");      //Powers that are always primarily defensive
        keywords.add("lethal");         //Powers that are always offensive and very dangerous

        keywords.add("temporary");      //Power effects always revert to normal
        keywords.add("permanent");      //Power effects are hard to reverse
        keywords.add("preparation");    //Preparation is needed to maximize powers
        keywords.add("versatile");      //Powers that often have wide applications

        //keywords that deal with the range or target of powers---------------------------------------------------------

        keywords.add("aura");           //Auras are common
        keywords.add("self");           //Powers only affect the user (only includes active-ish powers)
        keywords.add("others");         //Powers that specifically affect others
        keywords.add("object-oriented");//Powers that deal with objects
        keywords.add("environment");    //Powers that involve the environment

        keywords.add("singular");       //Powers that have exactly one target (not including the user)
        keywords.add("multitude");      //Powers that target a large number of things

        keywords.add("short-range");    //Close-range is common (within 10 feet)
        keywords.add("mid-range");      //Medium range is common (10-50 feet)
        keywords.add("long-range");     //Long range is common (50+ feet)

        //keywords for Brute powers-------------------------------------------------------------------------------------

        keywords.add("shield");         //Some sort of shielding is common
        keywords.add("durability");     //Increased durability is common
        keywords.add("regeneration");   //Regeneration is common
        keywords.add("resurrection");   //Powers involving resurrection

        keywords.add("strength");       //Increased strength is common
        keywords.add("size");         //Increased size is common

        //keywords for Thinker and Stranger powers----------------------------------------------------------------------

        keywords.add("mental");         //Powers that involve the mind
            keywords.add("processing");     //Powers that vastly increase processing of stimuli
            keywords.add("solution");       //Powers that help solve problems
            keywords.add("skills");         //Powers that affect skills or skill acquisition
            keywords.add("emotions");       //Powers that involve emotions
            keywords.add("precognition");   //Powers that see into the future
            keywords.add("postcognition");  //Powers that see into the past
        keywords.add("sensory");        //Sensory-type powers
        keywords.add("stealth");        //High chance of powers useful in espionage

        //keywords for Mover powers-------------------------------------------------------------------------------------

        keywords.add("movement");       //Mover powers common
            keywords.add("agility");        //Increased agility is common
            keywords.add("flight");         //Flight is common
            keywords.add("teleportation");  //Teleportation is common

        //keywords related to the "element" of the power----------------------------------------------------------------

        keywords.add("inorganic");      //Primarily affects inorganic matter
            keywords.add("technology");     //Powers involving technology are common
        keywords.add("organic");        //Involves life/living things
            keywords.add("animal");         //Powers involving animal biology
            keywords.add("plant");          //Powers involving plant biology

        keywords.add("elemental");      //Elemental abilities common
            keywords.add("fire");           //Fire, or lava-based powers
            keywords.add("acid");           //Acidic powers
            keywords.add("ice");            //Ice powers
            keywords.add("water");          //Water powers
            keywords.add("temperature");    //Temperature powers
            keywords.add("electricity");    //Electrical powers
            keywords.add("stone");          //Rock powers
            keywords.add("metal");          //Metal powers
            keywords.add("air");            //Air powers
            keywords.add("sound");          //Sound powers

        keywords.add("kinetic");        //Powers that affect kinetic energy
        keywords.add("shadow");         //Powers that employ darkness and shadow
        keywords.add("force field");    //Powers that employ force fields
        keywords.add("death");          //Powers involving death

        keywords.add("exotic");         //Powers that have exotic effects (time, dimensions, etc.)
            keywords.add("space");          //Powers that deal with spacial manipulation
            keywords.add("time");           //Powers that deal with time manipulation
            keywords.add("dimensional");    //Powers that deal with dimensional manipulation
            keywords.add("gravity");        //Powers that deal with gravity manipulation
            keywords.add("radiation");      //Powers that deal with radiation of various kinds

        //keywords related to the power-ratings-------------------------------------------------------------------------

        keywords.add("AoE");            //Area of Effect powers
        keywords.add("tinker");         //Tinker powers common
        keywords.add("changer");        //Alternate forms/transformations are common
        keywords.add("master");         //Powers that give control of minions commonly
        keywords.add("power-affecting");//Trump powers

        //keywords that deal with the values of a formula---------------------------------------------------------------

        keywords.add("safe");           //Deviation of 0,1,2
        keywords.add("deviant");        //Deviation of 8,9,10

        keywords.add("variable");       //Reliability of 1,2,3
        keywords.add("reliable");       //Reliability of 8,9,10

        keywords.add("powerful");       //Power of 8,9,10

        keywords.add("free");           //Price of 0
        keywords.add("cheap");          //Price of 1,2,3
        keywords.add("expensive");      //Price of 8,9,10

        keywords.add("unique");         //Originality of 8,9,10
        keywords.add("common");          //Originality of 1,2,3

        Collections.sort(keywords);
    }

    public static void main(String[] args)
    {
        Database2 data = new Database2();
        ArrayList<String> alphabet = data.getAlphabet();
        ArrayList<Formula2> formulas = data.getFormulae();
        int x = 0;
        int total = 0;
        for (int i = 0; i < alphabet.size(); ++i)
        {
            for (int j = 0; j < formulas.size(); ++j)
            {
                if (formulas.get(j).getCode().contains(alphabet.get(i)))
                {
                    x = x + 1;
                    total = total + 1;
                }
            }
            System.out.println(alphabet.get(i) + ": " + x);
            x = 0;
        }
        System.out.println("Total: " + total);
        System.out.println(x*(x-1)*(x-2)+x*(x-1)+x + " Combinations (not including varied percentages)");
    }
}
//Series List                                                                 Common Words In Series
//A series have all "classic"-type powers (super strength, flight, etc.)             "common"
//B series have close range formulas                                               "short-range"
//C series have ranged formulas                                             "mid-range" or "long-range"
//D series have defensive/durable/protective formulas                               "defensive"
//E series have area of effect formulas                                                "AoE"                //under review
//F series have movement formulas                                                    "movement"
//G series have stealth/espionage formulas                                           "stealth"
//H series have transformation formulas                                              "changer"
//I series have formulas that only affect the user                                    "self"                //under review
//J series have elemental formulas                                                  "elemental"
//K series have formulas with powers that have trade-offs
//L series have formulas with a high chance of deviation                             "deviant"
//M series have organic-power formulas                                               "organic"
//N series have sensory-type formulas                                                "sensory"
//O series have formulas that see into the past or future                "postcognition" or "precognition"
//P series have mental processing formulas                                           "mental"
//Q series have building/inventor formulas                                           "tinker"
//R series have object-oriented formulas                                          "object-oriented"
//S series have (Trump) power-affecting formulas                                 "power-affecting"
//T series have minions they create and/or control                                   "master"
//U series can control/create/affect parts of the environment                      "environment"
//V series have horrifying/terrifying formulas                                     "terrifying"
//W series have whimsically themed formulas                                "otherworldly" or "whimsical"
//X series are the exotic formulas (time, gravity, dimensions,etc.)                  "exotic"
//Y series have "casual" or recreational formulas                                  "recreational"
//Z series are formula modifiers (stabilizers, speed, range, etc.)              "formula modifier"