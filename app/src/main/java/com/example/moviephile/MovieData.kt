package com.example.moviephile


object MovieData {
    private val movieName = arrayOf(
        "Black Panther: Wakanda Forever",
        "Jujutsu Kaisen 0",
        "Jurassic World Dominion,",
        "Knives Out",
        "Mission: Impossible - Fallout",
        "No Time to Die",
        "Spider-Man: Into the Spider-Verse",
        "Spider-Man: No Way Home",
        "Top Gun: Maverick",
        "Venom: Let There Be Carnage"
    )

    private val movieYear = arrayOf(
        "2022",
        "2021",
        "2022",
        "2019",
        "2018",
        "2021",
        "2018",
        "2021",
        "2022",
        "2021"
    )

    private val movieCountry = arrayOf(
        "US",
        "JP",
        "US",
        "US",
        "US",
        "GB",
        "US",
        "US",
        "US",
        "US"
    )

    private val movieDuration = arrayOf(
        "162 Minutes",
        "105 Minutes",
        "147 Minutes",
        "131 Minutes",
        "147 Minutes",
        "163 Minutes",
        "117 Minutes",
        "148 Minutes",
        "131 Minutes",
        "97 Minutes"
    )

    private val movieOverview = arrayOf(
        "This time, the people of Wakanda will fight to protect their country from interference from world powers after the death of King T\'Challa.",
        "Yuta Okkotsu is a loner high school student in deep trouble-his childhood friend Rika has become a cursed spirit that refuses to let go of him.",
        "Four years after the destruction of the island of Nublar, dinosaurs now live and hunt alongside humans around the world.",
        "When renowned crime novelist Harlan Thrombey is found dead on his estate just after his 85th birthday, the inquisitive and mysteriously debonair Detective Benoit Blanc is asked to investigate.",
        "When an IMF mission ends badly, the world is faced with dire consequences.",
        "James Bond has retired and is living the high life in Jamaica. But all that is interrupted when his old friend Felix Leiter from the CIA shows up and asks for his help.",
        "Spider-Man traverses parallel dimensions and teams up with Spider-Men from those dimensions to stop a threat to all realities.",
        "Spider-Man\'s identity is now revealed, and Peter enlists the help of Doctor Strange. But a mistake is made, and it invites dangerous enemies from another world, they begin to appear.",
        "Over 30 years of service as one of the Navy\'s finest aviators, Pete Maverick Mitchell was in his dream position, performing ground-breaking stunts as a daring test pilot.",
        "Venom returns to action when serial killer Cletus Kasady transforms into the evil Carnage."
    )

    private val moviePhoto = arrayOf(
        R.drawable.blackpanther_wf,
        R.drawable.jujutsukaisen_0,
        R.drawable.jurassicparkdominion,
        R.drawable.knivesout,
        R.drawable.missionimpossible_fallout,
        R.drawable.notimetodie,
        R.drawable.spiderman_its,
        R.drawable.spiderman_nwh,
        R.drawable.topgun_m,
        R.drawable.venom2
    )

    private val movieSynopsis = arrayOf(
        "T'Challa, king of Wakanda, is dying from an unspecified terminal illness which his sister Shuri believes can be cured by the \"heart-shaped herb\". Shuri attempts to synthetically recreate the herb after it was destroyed by Erik Killmonger,[a] but fails to do so before T'Challa dies.\n" +
                "\n" +
                "One year later, Wakanda is under pressure from other nations to share their vibranium, with some parties attempting to steal it by force. Queen Ramonda implores Shuri to continue her research on the herb, hoping to create a new Black Panther that will defend Wakanda, but she refuses due to her belief that the Black Panther is a figure of the past. In the Atlantic Ocean, the CIA and U.S. Navy SEALs utilize a vibranium detector to locate a potential vibranium deposit underwater. The expedition is killed by a group of blue-skinned, water-breathing superhumans led by Namor, with the CIA believing Wakanda to be responsible. Namor confronts Ramonda and Shuri, easily bypassing Wakanda's advanced security. Blaming Wakanda for the vibranium race, he gives them an ultimatum: deliver him the scientist responsible for the vibranium detector, or he will attack Wakanda.\n" +
                "\n" +
                "Shuri and Okoye learn from CIA agent Everett K. Ross that the scientist in question is MIT student Riri Williams and arrive at the university to confront her. The group is pursued by the FBI and then by Namor's warriors, who defeat Okoye before taking Shuri and Williams underwater to meet Namor. Angered by Okoye's failure to protect Shuri, Ramonda strips her of her title as general of the Dora Milaje and seeks out Nakia, who has been living in Haiti since The Blip.[b] Namor shows Shuri his vibranium-rich underwater kingdom of Talokan, which he has protected for centuries from discovery by the world. Bitter at the surface world for enslaving the Maya, Namor proposes an alliance with Wakanda against the rest of the world but threatens to destroy Wakanda if they refuse. Nakia helps Shuri and Williams escape, killing a Talokanil guard in the process, and Namor retaliates with an attack against Wakanda, during which Ramonda drowns while saving Williams. Namor vows to return with his full army, and the citizens of Wakanda relocate to the Jabari mountains for their safety. Meanwhile, Ross is arrested by his ex-wife, CIA director Valentina Allegra de Fontaine, for secretly exchanging classified intelligence with the Wakandans.\n" +
                "\n" +
                "After Ramonda's funeral, Shuri uses a remnant of the herb that gave Namor's people their superhuman abilities to reconstruct the heart-shaped herb. She ingests it, gaining superhuman abilities and meeting Killmonger in the Ancestral Plane, who urges her to seek revenge. Shuri dons a new Black Panther suit and is accepted by the other Wakandan tribes as the Black Panther. Despite M'Baku's urges for peace, Shuri is determined to exact vengeance on Namor for Ramonda's death and orders an immediate counterattack on Talokan. Preparing for battle, with Ayo assuming the position of general of the Dora Milaje, Shuri bestows the Midnight Angel armor upon Okoye, who in turn recruits Dora Milaje member Aneka to join her. Williams creates an Iron Man-esque powered exoskeleton to aid the Wakandans.\n" +
                "\n" +
                "Using a seafaring vessel, the Wakandans lure Namor and his warriors to the surface with another vibranium detector as a battle ensues. Shuri traps Namor in a fighter aircraft, intending to dry him out and weaken him. The pair crashes on a desert beach and fight. Shuri gains the upper hand, but has a vision of Ramonda and implores Namor to yield, offering him a peaceful alliance. Namor accepts, and the battle ends. Namor's cousin, Namora, is upset at Namor's surrender, but he assures her that the new alliance will allow them to conquer the surface world one day. Williams returns to MIT, leaving her suit behind, while Okoye rescues Ross from captivity. Shuri plants more heart-shaped herbs to ensure the future of the Black Panther mantle. In Shuri's absence, M'Baku steps forward to challenge for the throne. Shuri visits Nakia in Haiti where she burns her funeral robe in accordance with Ramonda's wishes, allowing herself to finally grieve for T'Challa.\n" +
                "\n" +
                "In a mid-credits scene, Shuri learns that Nakia and T'Challa had a son named Toussaint, whom Nakia has been raising in secret. Toussaint reveals his Wakandan name is T'Challa.",

        "High school student Yuta Okkotsu suffers from being frequently bullied, when one day, his bullies are brutally killed by a cursed spirit that clings to him. The higher-ups of Jujutsu Society wish to have the boy killed, as the curse he is host to is a dangerous spirit. However, a teacher at the Tokyo Jujutsu Technical High, Satoru Gojo, instead recruits Yuta to join the school. Yuta explains that the cursed spirit is that of Rika, a childhood friend whom he had promised to marry when they grew up. Rika had died in a freak accident and was reborn as an overprotective, cursed spirit that clings to Yuta and harms anyone who threatens him. Yuta meets fellow students Maki Zen'in, Toge Inumaki, and Panda, all with distinct abilities of their own, and are initially apprehensive at Yuta, and in particular Rika.\n" +
                "\n" +
                "During his first mission with Maki, she helps convince him to control Rika's curse, and he is successfully able to summon Rika to save them from a cursed spirit; Gojo warns Yuta not to summon her again, however. Three months pass in his training, and Yuta grows close to Maki, Inumaki, and Panda. One day, on a mission with Inumaki, the boys are unexpectedly attacked by a high-level curse that they are eventually able to deal with by working together. Gojo realizes that the man behind the attack was Suguru Geto, a previous student and old friend of his from school, who was banished after killing over a hundred innocent people. Geto had started a cult to help troubled people, under the guise of collecting cursed spirits using his curse technique.\n" +
                "\n" +
                "Suddenly appearing at the school, Geto attempts to get Yuta on his side, so they can make use of Rika, but Yuta refuses. Geto then declares war on the sorcerers: he will release a thousand curses upon the city on Christmas, to kill non-sorcerer humans, as he believes them to be useless. Geto's real reason for the war, however, is to distract Gojo, so he can isolate and kill Yuta, and absorb Rika for himself. Anticipating this plan, Gojo transports Inumaki and Panda back to the school, to protect Yuta, who is with Maki and not taking part in the battle as newbies. Geto quickly overpowers all three of them, leaving only Yuta, who summons Rika again, promising himself as a sacrifice if she helps defeat Geto. The two combine their powers to successfully defeat Geto, even after Geto uses his curse technique to its fullest. Geto is ultimately severely wounded and nearly escapes, until he is found by Gojo, who promptly finishes him off.\n" +
                "\n" +
                "When reuniting with his students, Gojo explains Yuta was the one who inadvertently cursed Rika, by being unable to accept her death and forcing her to remain by his side. Both Yuta and Gojo are actually descendants of one of the strongest sorcerers in history, which explains their powerful abilities. Rika bids Yuta a warm goodbye, and he continues on as a sorcerer-in-training with his friends. Yuta still wears Rika's engagement ring. Gojo grieves for the death of Geto whom he regarded as his only friend.\n" +
                "\n" +
                "In a post-credits scene, Geto's former ally Miguel eats lunch with Yuta in Kenya, and Gojo comes to join them. ",

        "Four years after the Lockwood Estate incident and the volcanic eruption on Isla Nublar,[a] once-extinct dinosaurs freely roam the Earth and cause ecological disasters and are subject to animal cruelty. Amid global efforts to control the invasive species, Biosyn Genetics establishes a dinosaur preserve in Italy's Dolomites which conducts genomics research, ostensibly for pharmacological applications.\n" +
                "\n" +
                "Claire Dearing, Zia Rodriguez, and Franklin Webb, still with the Dinosaur Protection Group, investigate illegal dinosaur breeding sites; Claire's partner, Owen Grady, helps relocate stray dinosaurs. At their remote cabin in the Sierra Nevada Mountains, Claire and Owen secretly raise 14-year-old Maisie Lockwood (Benjamin Lockwood's biogenetic granddaughter) and protect her from nefarious groups seeking to exploit her unique genetic makeup. When Blue, (the Velociraptor raised by Owen), arrives with an asexually-reproduced hatchling, Maisie names it Beta. Increasingly frustrated living in seclusion, Maisie sneaks away, but mercenaries kidnap her and capture Beta.\n" +
                "\n" +
                "Meanwhile, swarms of giant locusts are decimating U.S. crops. Divorced[b] paleobotanist Dr. Ellie Sattler observes that corporate-grown crops using Biosyn seeds are left uneaten, raising suspicions that they created the insects. Ellie takes a captured locust to her former partner, paleontologist Dr. Alan Grant. They determine that the locust was genetically engineered with Cretaceous-period arthropod DNA and contemporary migratory locusts.\n" +
                "\n" +
                "Franklin, now with the CIA's dangerous-species division, informs Claire and Owen that Maisie may have been taken to Malta. Upon arrival, Claire and Owen infiltrate a dinosaur black market with Owen's former Jurassic World colleague Barry Sembène, who is leading a raid for French Intelligence. Carnivorous dinosaurs are unleashed during the foray, wreaking havoc. Claire and Owen learn that Maisie and Beta were transported to Biosyn, and sympathetic cargo pilot Kayla Watts agrees to fly them there.\n" +
                "\n" +
                "Chaotician Dr. Ian Malcolm, now working for Biosyn, has sought Ellie's help to expose CEO Dr. Lewis Dodgson after communications director Ramsay Cole warned him of Dodgson's illegal activities. Dodgson is exploiting dinosaurs and coerces former InGen geneticist Dr. Henry Wu to modify the transgenic locust to control the world's food supply. Wu denounces the plan, saying it will cause global famine as the locusts spread unchecked. Wu meets Maisie and explains that his former colleague, Dr. Charlotte Lockwood (Benjamin Lockwood's deceased daughter), used her own DNA to replicate and give birth to the genetically identical Maisie. Charlotte altered Maisie's DNA to prevent her from inheriting the fatal disease which she had. Wu believes that Maisie and Beta's asexual conception and DNA are key to creating a pathogen to halt the locust outbreak.\n" +
                "\n" +
                "A Quetzalcoatlus attacks Kayla's plane in Biosyn's airspace, forcing Owen and Kayla to crash land while Claire is ejected. After separate encounters with a Therizinosaurus, Pyroraptor and Dilophosaurus, the three regroup. Inside Biosyn, Ian and Ramsay guide Ellie and Alan into accessing a restricted lab to obtain a locust DNA sample. They encounter Maisie there, and take her with them. Discovering the breach, Dodgson incinerates the locusts to destroy evidence; the resulting inferno escapes through an air vent, sparking a wildfire around the site.\n" +
                "\n" +
                "Alan, Ellie, and Maisie barely escape the facility before finding Ian. They meet Owen, Claire and Kayla, with Ramsay later joining them. Dodgson flees with dinosaur embryos[c] via a hyperloop, but becomes trapped in a tunnel after Ellie and Claire reroute the power and is promptly killed by three Dilophosaurus. As the group works together, Owen, with Alan and Maisie's help, captures Beta. They and Wu escape in a Biosyn helicopter during a battle between a Giganotosaurus and the first park's veteran Tyrannosaurus (Rexy), aided by the Therizinosaurus.\n" +
                "\n" +
                "Ellie and Alan rekindle their relationship before testifying with Ian and Ramsay against Biosyn. Owen, Claire, and Maisie return home and reunite Beta and Blue. Wu releases a host locust carrying the pathogen, gradually eradicating the swarms. Dinosaurs and humans adapt to a new co-existence, and the United Nations declares Biosyn Valley an international dinosaur sanctuary. ",

        "The family of Harlan Thrombey, a wealthy mystery novelist, attends his 85th birthday party at his Massachusetts mansion. His housekeeper, Fran, finds him dead next morning with his throat slit. Police believe Harlan's death to be suicide, but private detective Benoit Blanc is anonymously hired to investigate. Blanc learns Harlan had strained relationships with his family, having made threats that day to son-in-law Richard and daughter-in-law Joni, fired his son Walt, and argued with grandson Ransom.\n" +
                "\n" +
                "Harlan's nurse, Marta Cabrera, mixed up his medications after the party, making her think she overdosed him with morphine, and was unable to find the antidote, apparently leaving Harlan only minutes to live. Harlan gives her instructions to create a false alibi and slits his own throat to protect her. Harlan's mother mistakes the fleeing Marta for Ransom. Marta cannot lie without vomiting, so she gives accurate but incomplete answers when questioned. She agrees to assist Blanc's investigation but does not disclose these events. Harlan's will leaves Marta as sole beneficiary. Ransom helps Marta escape, and offers help in exchange for some of the inheritance, the rest of the family try to persuade or threaten Marta to renounce the inheritance.\n" +
                "\n" +
                "Marta receives a blackmail note with a partial photocopy of Harlan's toxicology report. She and Ransom drive to the medical examiner's office, but it has burned down. Marta receives an email proposing a rendezvous with the blackmailer, while Ransom is arrested after a brief car chase. At the rendezvous, Marta finds Fran drugged. She performs CPR and calls an ambulance. She confesses to Blanc, though Ransom has already informed on her, and she decides to admit causing Harlan's death, which would invalidate her inheritance under the slayer rule.\n" +
                "\n" +
                "Back at the mansion, Marta finds Fran's copy of the full toxicology report, and gives it to Blanc. It shows little morphine in Harlan's system. Blanc explains to Ransom and Marta his deductions: that Harlan had told Ransom of the intended will, and that Ransom had then swapped the medicines to ensure that as killer, Marta would be unable to inherit, leaving the estate to the family, but being a skilled nurse Marta had correctly dosed anyway because she relied on the appearance of the medicines, and subconsciously identified the morphine correctly; she only thought she had poisoned him after reading the label. When the death was reported as a suicide, Ransom anonymously hired Blanc to expose Marta. Fran saw Ransom tampering with the crime scene and sent him the blackmail note. After Ransom realized Marta was not responsible for Harlan's death, but Marta still thought she was, he forwarded the blackmail letter to Marta and burned down the medical examiner's office to destroy evidence of her innocence. He then overdosed Fran with morphine, intending for Marta to get caught with Fran's corpse, and be unable to inherit anyway.\n" +
                "\n" +
                "The hospital calls; Marta relays that Fran survived and will implicate Ransom; he scoffs that since his attempt to kill Fran failed, his lawyers will help him escape attempted murder charges. Marta vomits on him, revealing that she lied: Fran is dead. Realizing he has confessed to the murder, with Wagner recording the conversation, Ransom attacks Marta with a knife from Harlan's collection, which turns out to be a retractable stage knife. The police promptly arrest him.\n" +
                "\n" +
                "Blanc tells Marta he suspected early on that she played a part in Harlan's death, noting a drop of blood on her shoe. As Ransom is taken into custody, Marta watches from the balcony of what is now her mansion, with the Thrombey family gathered outside. ",

        "Two years after Solomon Lane's capture, the remnants of the Syndicate have reorganized as a terrorist group known as the Apostles, having adopted the 'Terror for hire' policy. They are hired by an extremist known as John Lark, and are attempting to acquire three stolen plutonium cores for him to use in three nuclear bombs. IMF Agent Ethan Hunt is assigned to recover the plutonium. During the mission, the Apostles take fellow teammate Luther Stickell hostage. Ethan chooses to save Stickell, allowing the Apostles to steal the cores and resulting in the mission to fail. The IMF team later captures Norwegian nuclear weapons expert Nils Delbruuk, whom the CIA believes is building weapons for Lark. Using a fake broadcast of teammate Benji Dunn posing as CNN's Wolf Blitzer and announcing the bombings of Rome, Jerusalem and Mecca, they trick Delbruuk into unlocking a phone he used to communicate with Lark.\n" +
                "\n" +
                "Furious at the IMF's failure to secure the plutonium, CIA Director Erika Sloane instructs Special Activities Division Agent August Walker to accompany Ethan on a mission to retrieve it. Ethan and Walker infiltrate a Paris nightclub where Lark is supposed to purchase the plutonium from the Apostles, with arms dealer Alanna Mitsopolis acting as a broker. They track a man they suspect to be Lark, but after an intense fight in the men's restroom, he is killed by MI6 Agent Ilsa Faust. Ethan assumes the identity of Lark and meets with Mitsopolis, but the meeting is cut short when hitmen attack. In exchange for the plutonium, Mitsopolis tasks Ethan with extracting Lane from an armored convoy moving through Paris, and provides one of the plutonium cores as a down payment.\n" +
                "\n" +
                "Ethan and Walker preemptively attack the convoy to prevent Mitsopolis’ brother Zola and their men from killing local police. They lead both the police and Mitsopolis's men on a chase while Dunn and Stickell secure Lane. Mitsopolis then instructs Ethan to deliver Lane to London. At a London safe house, IMF Secretary Hunley orders Ethan to stop the mission and turn himself in after receiving doctored evidence implicating Ethan as Lark. The team trick Walker into admitting he is the real Lark and inform Sloane, who sends a CIA unit to take everyone into custody. However, the unit has been infiltrated by the Apostles and is under Walker's command.\n" +
                "\n" +
                "Walker kills Hunley after stabbing him and Ethan pursues him to Tate Modern, where Walker threatens his ex-wife, Julia Meade, before escaping by helicopter. The team, along with Faust, track Lane and Walker to a medical camp over the Kashmir region and Siachen Glacier. Faust deduces that Lane is planning to detonate the nuclear bombs at the medical camp, contaminating the water supply of India, Pakistan, and China, resulting in the destruction of 1/3 of the world's population. The bombs are linked by a failsafe; any attempt to defuse one bomb without also disarming the detonator will trigger the others. Ethan discovers Julia and her new husband Erik are working at the camp. Lane programs the bombs' detonator with a 15-minute countdown and gives it to Walker.\n" +
                "\n" +
                "Walker takes off in a helicopter while Dunn, Stickell, and Faust try to find and defuse the nuclear weapons quietly. Julia helps Stickell disarm the first bomb, but they are unable to defuse it without the detonator. Faust finds the second bomb but is ambushed and subdued by Lane; Dunn and Faust eventually overpower him. Ethan hijacks an escort helicopter and manages to plunge Walker's out of the sky. The two men fight on the edge of a cliff, which ends when Ethan drops a hook attached to a helicopter on Walker. Ethan secures the detonator, allowing the team to deactivate the bombs at the last second. In the aftermath, Julia tells Ethan that he has given her the best life, despite his commitment to the IMF. Sloane hands Lane over to MI6 through Mitsopolis, earning Faust her exoneration, and praises Ethan for his actions. ",

        "A young Madeleine Swann witnesses the murder of her mother by Lyutsifer Safin, whose family was assassinated by Swann's father Mr. White under orders from Ernst Stavro Blofeld. Swann shoots Safin and flees, falling into a frozen lake, but Safin rescues her.\n" +
                "\n" +
                "In the present, after Blofeld's arrest,[a] Swann travels to Matera with James Bond. She asks Bond to visit the nearby grave of his ex-lover Vesper Lynd, where he survives an explosion orchestrated by Spectre operatives led by Primo, a mercenary with a bionic eye. Bond escapes with Swann but ends their relationship, believing that she betrayed him.\n" +
                "\n" +
                "Five years later, Spectre agents extract MI6 scientist Valdo Obruchev, who is secretly working for Safin, from a laboratory in London and steal Project Heracles, a programmable DNA-targeting nanobot weapon developed under M's oversight. Retired and living in Jamaica, Bond is contacted by CIA ally Felix Leiter and State Department agent Logan Ash, who ask for Bond's help extracting Obruchev from a Spectre party in Cuba. Bond declines but later accepts after Nomi, his successor as Agent 007, warns him not to interfere with her own extraction of Obruchev and puts him in contact with M, who refuses to answer his questions about Heracles.\n" +
                "\n" +
                "Bond infiltrates the party with Paloma, a Cuban agent assisting Leiter. Blofeld, overseeing the gathering from Belmarsh through Primo's bionic eye, disperses a nanobot mist to kill Bond. However, Obruchev reprogrammed the nanobots under Safin's orders to kill the Spectre members instead. Outmaneuvering Nomi with Paloma's help, Bond brings Obruchev to Ash and Leiter aboard a trawler. Ash, also working for Safin, shoots Leiter and traps him with Bond below deck, fleeing with Obruchev after blowing up the ship. Leiter dies of his wounds, but Bond escapes.\n" +
                "\n" +
                "Bond returns to London seeking to interrogate Blofeld about Obruchev's employer, but Blofeld reportedly only speaks to his psychiatrist, Swann. Safin secretly forces Swann to infect herself with a nanobot dose to assassinate Blofeld. Meeting Swann in Belmarsh, Bond unknowingly infects himself with the nanobots by touching her. Swann is too distressed to confront Blofeld, who confesses to Bond that he planned the explosion at Vesper's grave to make Bond believe that Madeleine betrayed him. Enraged, Bond briefly strangles Blofeld, unknowingly allowing the nanobots to enter his system and kill him.\n" +
                "\n" +
                "Bond tracks Swann to her childhood home in Norway, where they reconcile, and he meets her five-year-old daughter Mathilde. Swann insists she is not his child and shares intelligence her father gathered about Safin and the island his family owned. The following day, MI6 alert Bond that Ash is approaching, leading to a chase into a nearby forest. Bond defeats his thugs and kills Ash, avenging Leiter's death, but Safin abducts Swann and Mathilde.\n" +
                "\n" +
                "Q provides Bond and Nomi with a submersible glider to infiltrate Safin's headquarters, a missile base in the Sea of Japan converted into a nanobot factory. Bond confronts Safin, who flees with Mathilde but later releases her, while Swann escapes and reunites with Bond and Mathilde. Nomi kills Obruchev by kicking him into a pool of acid,[4] then escorts Swann and Mathilde off the island. Bond kills Safin's remaining men, including Primo, then stays to open the silo doors for missiles launched from HMS Dragon to penetrate. Bond rushes back inside when the silo doors begin closing but is ambushed by Safin, who infects him with a nanobot vial programmed to kill Swann and Mathilde. Bond shoots Safin dead and reopens the silo doors, but he chooses to remain on the island to keep Swann and Mathilde safe. He radios Swann to say goodbye, expressing his love for her and Mathilde, who she confirms is his daughter. The missiles strike the island and destroy the facility, killing Bond.[5]\n" +
                "\n" +
                "Later, at MI6, M, Moneypenny, Nomi, Q, and Bill Tanner drink to Bond's memory. Driving Mathilde to Matera, Swann tells her a story about a man named James Bond. ",

        "New York City teenager Miles Morales struggles to live up to the expectations of his father, police officer Jefferson Davis, who sees Spider-Man as a menace. Miles adjusts to prep school, and visits his uncle Aaron Davis, who takes him to an abandoned subway station to paint graffiti. Miles is bitten by a radioactive spider and gains spider-like abilities similar to Spider-Man. Returning to the station, Miles discovers a collider built by Wilson Fisk, who hopes to access parallel universes to bring back his late wife and son, whose deaths he blames on Spider-Man. Miles watches as Spider-Man attempts to disable the collider while fighting Wilson's henchmen, Green Goblin and the Prowler.\n" +
                "\n" +
                "Spider-Man saves Miles, but Green Goblin shoves Spider-Man into the collider, causing an explosion that kills Goblin and severely wounds Spider-Man. Spider-Man gives Miles a USB flash drive designed to disable the collider, warning that the machine could destroy the city if reactivated. After watching in horror as Wilson kills Spider-Man, Miles flees with Prowler in pursuit, eventually getting away from him. As the city mourns Spider-Man's death, Miles tries to honor his legacy and become the new Spider-Man. While trying out his newfound abilities, he inadvertently damages the drive. At Spider-Man's grave, Miles meets Peter B. Parker, an older and worn-down version of Spider-Man from another dimension. Upon meeting him, Miles discovers his ability to emit bio-electric bursts called \"venom-blasts\".\n" +
                "\n" +
                "Peter reluctantly agrees to train Miles in exchange for help stealing data to create a new drive. They infiltrate Wilson's research facility, and Miles discovers he has the power to turn invisible. They are confronted by mad scientist Olivia Octavius, who discovers that Peter will die from cellular decay if he remains in their dimension. Chased through the laboratory and surrounding forest by Octavius, Miles and Peter are saved by Gwen Stacy, a Spider-Woman from another dimension. They then visit Peter's aunt, May Parker, who is sheltering more Spider-people from other dimensions – Spider-Man Noir, Peni Parker, and Spider-Ham – who are also deteriorating. Miles offers to disable the collider so the others can return home, but after questioning and testing him, they tell him that he lacks experience.\n" +
                "\n" +
                "Distraught, Miles retreats to Aaron's home, where he discovers Aaron is the Prowler. Miles returns to May's house, where Peni has completed the new drive; he is followed by Wilson, Prowler, Octavius, Scorpion, and Tombstone. In the ensuing brawl, Miles reveals his identity to Aaron just as Aaron corners him. Unwilling to kill his own nephew, Aaron spares Miles, but is fatally shot by Wilson. Miles flees with Aaron, who tells him to keep going before dying. Jefferson arrives on the scene and Miles escapes, leading Jefferson to mistake Spider-Man as Aaron's murderer. The heroes regroup with a distraught Miles at his dorm room. Peter restrains Miles to ensure his safety and leaves with the others, choosing to sacrifice himself by staying behind and deactivating the collider.\n" +
                "\n" +
                "Jefferson arrives outside Miles' door and, assuming Miles does not want to speak to him, apologizes for his mistakes and inspires Miles. Miles then manages to control his powers, escapes his restraints, and creates his own Spider-Man suit with May's help. He joins the heroes, defeating Wilson's enforcers and using the new drive to send them home. Wilson fights Miles, attracting the attention of Jefferson, who realizes that Spider-Man isn't the menace he saw him as. Jefferson encourages Miles, who subdues Wilson with his venom-blast and throws him at the kill switch, destroying the collider. Wilson and his henchmen are arrested for their crimes and Jefferson recognizes the new Spider-Man as a hero while receiving evidence of Wilson's murders of Peter and Aaron.\n" +
                "\n" +
                "Miles embraces the responsibilities of his new life, while the heroes return to their lives in their own dimensions. Later, Gwen finds a way to contact Miles from her own dimension.[N 1] In another dimension, Miguel O'Hara travels to the universe of the 1967 Spider-Man animated series and argues with its Spider-Man.",

        "After Quentin Beck frames Peter Parker for his murder and reveals Parker's identity as Spider-Man,[a] Parker, his girlfriend Michelle \"MJ\" Jones-Watson, best friend Ned Leeds, and aunt May are interrogated by the Department of Damage Control. Lawyer Matt Murdock gets Parker's charges dropped, but the group grapples with negative publicity. After Parker, MJ, and Ned's MIT applications are rejected, Parker goes to the New York Sanctum to ask Stephen Strange for help. Strange starts casting a spell that would make everyone forget Parker is Spider-Man, but it is corrupted when Parker repeatedly requests alterations to let his loved ones retain their memories, ultimately causing Strange to contain the spell to stop it.\n" +
                "\n" +
                "At Strange's suggestion, Parker tries to convince an MIT administrator to reconsider the applications of MJ and Ned, but is attacked by Otto Octavius. Octavius rips nanotechnology from Parker's Iron Spider suit, which bonds with his mechanical tentacles and allows Parker to control them. As Norman Osborn arrives and attacks, Strange teleports Parker back to the Sanctum and locks Octavius in a cell next to Curt Connors. Strange explains that the corrupted spell summoned people from other universes within the multiverse who know Spider-Man's identity. He orders Parker, MJ, and Ned to find and capture them; they locate and retrieve Max Dillon and Flint Marko at a military research facility.\n" +
                "\n" +
                "Osborn reclaims control of himself from his split Green Goblin personality and destroys the Goblin mask. He goes to a F.E.A.S.T. building, where May comforts him before Parker retrieves him. While discussing their battles with Spider-Man, Osborn, Octavius, and Dillon realize they were pulled from their universes just before their deaths.[b] Strange prepares to reverse the contained spell and send the villains back to their respective universes, but Parker argues that they should first cure the villains of the insanity that would lead to their deaths, to possibly change their fates upon their return. When Strange refuses, Parker steals the spell, traps Strange in the Mirror Dimension, and, with May, takes the villains to Happy Hogan's apartment, where he uses Stark Industries technology to cure Octavius. Before Parker can cure anyone else, his spider-sense goes off. He then discovers that the Goblin persona retook control of Osborn, who convinces the uncured villains to betray Parker. As Dillon, Marko, and Connors escape, the Goblin fatally injures May. Before she dies, May tells Parker that \"with great power, there must also come great responsibility\".\n" +
                "\n" +
                "Ned discovers that he can create portals using Strange's sling ring, which he and MJ use to try to locate Parker. They instead find alternate versions of Parker from the villains' universes who were also summoned by Strange's spell and who are nicknamed \"Peter-Two\" and \"Peter-Three\". The group finds this universe's Parker, nicknamed \"Peter-One\", who is ready to give up and send the villains home to die. The alternate Parkers share stories of losing loved ones and encourage Peter-One to fight in May's honor, and the three Parkers develop cures for the villains.\n" +
                "\n" +
                "The group lure Dillon, Marko, and Connors to the Statue of Liberty. Peter-One and Peter-Two cure Connors and Marko, while Octavius arrives to help cure Dillon, and Ned frees Strange from the Mirror Dimension. The Goblin appears and unleashes the contained spell, which breaks apart the barriers between universes, pulling in countless others who know Parker's identity. Strange attempts to hold them off while an enraged Peter-One tries to kill the Goblin. Peter-Two stops him, but gets stabbed by the Goblin. Peter-Three helps Peter-One inject the Goblin with his cure, restoring Osborn's sanity. Peter-One realizes that the only way to protect the multiverse is to erase Peter Parker from everyone's memory and requests Strange to do so while promising MJ and Ned that he will find them again. Strange reluctantly casts the spell, and everyone returns to their respective universes—including Eddie Brock,[c] who unknowingly leaves behind a piece of the Venom symbiote.\n" +
                "\n" +
                "Two weeks later, Parker visits MJ to reintroduce himself, but he decides against it. While mourning at May's grave, he has a conversation with Hogan and is inspired to carry on, making a new suit.",

        "More than 30 years after graduating from Top Gun,[a] United States Navy Captain Pete \"Maverick\" Mitchell is a test pilot. Despite many achievements, repeated insubordination has kept him from flag rank;[b] his friend and former Top Gun rival, Admiral Tom \"Iceman\" Kazansky, now commander of the Pacific Fleet, often protects Maverick. Rear Admiral Chester \"Hammer\" Cain plans to cancel Maverick's hypersonic \"Darkstar\" scramjet program in favor of funding drones. To save the program, Maverick unilaterally changes the target speed for that day's test from Mach 9 to the final contract specification of Mach 10. However, the prototype is destroyed when he cannot resist pushing beyond Mach 10. Iceman again saves Maverick's career by assigning him to the Top Gun school at NAS North Island for his next assignment, but Cain tells Maverick that the era of crewed fighter aircraft will soon be over.\n" +
                "\n" +
                "The Navy has been tasked with destroying an unsanctioned uranium enrichment plant, located in an underground bunker at the end of a canyon, before it becomes operational. It is defended by surface-to-air missiles (SAMs), GPS jammers, and fifth-generation Su-57 fighters as well as older F-14 Tomcats. Maverick devises a plan employing two pairs of F/A-18E/F Super Hornets armed with laser-guided bombs,[c] but instead of participating in the strike, he is to train an elite group of Top Gun graduates assembled by Air Boss Vice Admiral Beau \"Cyclone\" Simpson.\n" +
                "\n" +
                "Maverick dogfights his skeptical students and prevails in every contest, winning their respect. Lieutenants Jake \"Hangman\" Seresin and Bradley \"Rooster\" Bradshaw—son of Maverick's dead best friend and RIO Nick \"Goose\" Bradshaw—clash: Rooster dislikes Hangman's cavalier attitude, while Hangman criticizes Rooster's cautious flying. Maverick reunites with former girlfriend Penny Benjamin, to whom he reveals that he promised Rooster's dying mother that Rooster would not become a pilot. Rooster, unaware of the promise, angrily resents Maverick for dropping his Naval Academy application—impeding his military career—and blames him for his father's death. Maverick is reluctant to further interfere with Rooster's career, but the alternative is to send him on the extremely dangerous mission. He tells his doubts to Iceman, who has terminal throat cancer. Iceman advises that \"It's time to let go\" and reassures him that both the Navy and Rooster need Maverick.\n" +
                "\n" +
                "After Iceman dies, Cyclone removes Maverick as instructor following a training incident in which an F/A-18F is lost. Cyclone relaxes the mission parameters, so they are easier to execute but make escape much more difficult. During Cyclone's announcement, Maverick makes an unauthorized flight through the course with his preferred parameters, proving that it can be done. Cyclone reluctantly appoints Maverick as team leader.\n" +
                "\n" +
                "Maverick flies the lead F/A-18E, accompanied by a buddy lazing F/A-18F[d] flown by Lieutenant Natasha \"Phoenix\" Trace and WSO Lieutenant Robert \"Bob\" Floyd. Rooster leads the second strike pair, which includes Lieutenant Reuben \"Payback\" Fitch and WSO Lieutenant Mickey \"Fanboy\" Garcia. The four jets launch from an aircraft carrier, and Tomahawk cruise missiles destroy the nearby air base as they approach. The teams destroy the plant, but the SAMs open fire during their escape, as anticipated. Rooster runs out of countermeasures, and Maverick sacrifices his plane to protect him. Believing Maverick to be dead, the others are ordered back to the carrier, but Rooster returns to find that Maverick ejected and is being targeted by an Mi-24 attack helicopter. After destroying the gunship, Rooster is shot down by a SAM and ejects. The two rendezvous and steal an F-14 from the damaged air base. Maverick and Rooster destroy two intercepting Su-57s, but a third attacks as they run out of ammunition and countermeasures. Hangman arrives in time to shoot it down, and the planes return safely.\n" +
                "\n" +
                "Later, Rooster helps Maverick work on his P-51 Mustang. Rooster looks at a photo of their mission's success, pinned alongside a photo of his late father and a young Maverick, as Penny and Maverick fly off in the P-51",

        "In 1996, a young Cletus Kasady watches helplessly as his lover, Frances Barrison, is taken away from St. Estes Home for Unwanted Children to the Ravencroft Institute. On the way, Barrison uses her sonic scream powers to attack young police officer Patrick Mulligan. Mulligan shoots Barrison in the eye and suffers an injury to his ear due to her scream. Unbeknownst to Mulligan, who believes he killed her, Barrison is still taken to Ravencroft, where her abilities are restricted.\n" +
                "\n" +
                "In the present day, Mulligan is now a detective and asks journalist Eddie Brock to speak to serial killer Kasady in San Quentin State Prison, as Kasady refuses to talk to anyone other than Brock. After the visit, Brock's alien symbiote Venom deduces where Kasady has hidden the bodies of his victims, which gives Brock a considerable career boost. Brock is contacted by his ex-fiancée Anne Weying, who tells him that she is now engaged to Dr. Dan Lewis, to Venom's displeasure. Kasady, who has been found guilty of his crimes and sentenced to death by lethal injection, invites Brock to attend his execution. Brock speaks with Kasady, who insults Brock, provoking Venom to attack Kasady. Kasady bites Brock's hand and ingests a small part of the symbiote. Back home, Venom has an argument with Brock about wanting more freedom to eat criminals, and the symbiote decides to leave Brock's body and go off on its own.\n" +
                "\n" +
                "As Kasady's execution begins, a red symbiote emerges and blocks the injection. Named Carnage, it goes on a violent rampage through the prison, freeing inmates and killing guards. Carnage agrees to help Kasady break Barrison out of Ravencroft in exchange for Kasady's help eliminating Brock and Venom. Mulligan visits Brock at home and warns him about the situation. At Ravencroft, Kasady frees Barrison, and they travel to the St. Estes children's home to burn it down. Mulligan grows suspicious of Brock and arrests him. Brock contacts Weying as his lawyer and reveals that Venom has separated from him. As Venom makes his way through San Francisco by hopping from body to body, Weying finds him bonded to Mrs. Chen and convinces him to forgive Brock. Venom reunites with Brock, and they escape custody. Kasady takes Mulligan hostage, and Barrison captures Weying, taking them both to a cathedral where Kasady and Barrison plan to get married.\n" +
                "\n" +
                "Brock and Venom arrive to fight Carnage while Barrison seemingly kills Mulligan by hanging him with a chain. Venom is overpowered by Carnage but provokes Barrison into using her powers to separate Carnage and Kasady. Venom devours Carnage and kills Kasady while the collapsing cathedral crushes Barrison. Later, an alive Mulligan's eyes flash blue, revealing that he somehow absorbed a part of Carnage.[a] Brock and Venom, now fugitives, decide to take a vacation while they ponder their next steps. In a mid-credit scene, as Venom tells Brock about the symbiotes' knowledge of other universes, a blinding light transports them from their hotel room to another room where they watch J. Jonah Jameson talking about Spider-Man's revealed identity as Peter Parker on television. Venom then licks the screen after saying, \"That guy.\""
    )

    private val movieBackground = arrayOf(
        R.drawable.blackpanther_bg,
        R.drawable.jjk0_bg,
        R.drawable.jurassicworld_bg,
        R.drawable.knivesout_bg,
        R.drawable.impossible_bg,
        R.drawable.notimetodie_bg,
        R.drawable.spiderverse_bg,
        R.drawable.spidermannwh_bg,
        R.drawable.topgun_bg,
        R.drawable.venom_bg
    )

    val listData: ArrayList<Movie>
        get() {
            val list = arrayListOf<Movie>()
            for (position in movieName.indices) {
                val movie = Movie()
                movie.name = movieName[position]
                movie.year = movieYear[position]
                movie.country = movieCountry[position]
                movie.duration = movieDuration[position]
                movie.synopsis = movieSynopsis[position]
                movie.photo = moviePhoto[position]
                movie.overview = movieOverview[position]
                movie.background = movieBackground[position]
                list.add(movie)
            }
            return list
        }

}