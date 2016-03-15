package com.example.an.miniproject1;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * Created by An on 6/28/2015.
 */
public class Pages extends Activity {
    private static final String[] cinde={"THERE WAS once a rich man whose wife lay sick, and when she felt her end drawing near she called to her only daughter to come near her bed, and said, \"Dear child, be good and pious, and God will always take care of you, and I will look down upon you from Heaven, and will be with you.\" And then she closed her eyes and died. The maiden went every day to her mother's grave and wept and was always pious and good. When the winter came the snow covered the grave with a white covering, and when the sun came in the early spring and melted it away, the man took to himself another wife.",
            "The new wife brought two daughters home with her, and they were beautiful and fair in appearance, but at heart were black and ugly. And then began very evil times for the poor step-daughter.\n"+
            "\"Is the stupid creature to sit in the same room with us?\" said they; \"those who eat food must earn it. She is nothing but a kitchenmaid!\" They took away her pretty dresses, and put on her an old gray kirtle, and gave her wooden shoes to wear.",
            "\"Just look now at the proud princess, how she is decked out!\" cried they laughing, and then they sent her into the kitchen. There she was obliged to do heavy work from morning to night, get up early in the morning, draw water, make the fires, cook, and wash. Besides that, the sisters did their utmost to torment her- mocking her, and strewing peas and lentils among the ashes, and setting her to pick them up. In the evenings, when she was quite tired out with her hard day's work, she had no bed to lie on, but was obliged to rest on the hearth among the cinders. And because she always looked dusty and dirty, as if she had slept in the cinders, they named her Cinderella.",
            "It happened one day that the father went to the fair, and he asked his two stepdaughters what he should bring back for them. \"Fine clothes!\" said one. \"Pearls and jewels!\" said the other. \"But what will you have, Cinderella?\" said he. \"The first twig, father, that strikes against your hat on the way home; that is what I should like you to bring me.\" So he bought for the two step-daughters fine clothes, pearls, and jewels, and on his way back, as he rode through a green lane, a hazel twig struck against his hat; and he broke it off and carried it home with him. And when he reached home he gave to the step-daughters what they had wished for, and to Cinderella he gave the hazel twig. She thanked him, and went to her mother's grave, and planted this twig there, weeping so bitterly that the tears fell upon it and watered it, and it flourished and became a fine tree. Cinderella went to see it three times a day, and wept and prayed, and each time a white bird rose up from the tree, and if she uttered any wish the bird brought her whatever she had wished for.",
            "Now it came to pass that the King ordained a festival that shouldlast for three days, and to which all the beautiful young women of that country were bidden, so that the King's son might choose abride from among them. When the two stepdaughters heard that they too were bidden to appear, they felt very pleased, and they called Cinderella and said, \"Comb our hair, brush our shoes, and make our buckles fast, we are going to the wedding feast at the King's castle.\" When she heard this, Cinderella could not help crying, for she too would have liked to go to the dance, and she begged her step-mother to allow her.",
            "\"What! You Cinderella!\" said she, \"in all your dust and dirt, you want to go to the festival! you that have no dress and no shoes! you want to dance!\" But as she persisted in asking, at last the stepmother said, \"I have strewed a dishful of lentils in the ashes, and if you can pick them all up again in two hours you may go with us.\" Then the maiden went to the back-door that led into the garden, and called out, \"O gentle doves, O turtle-doves, And all the birds that be, The lentils that in ashes lie Come and pick up for me! The good must be put in the dish, The bad you may eat if you wish.\" Then there came to the kitchen-window two white doves, and after them some turtle-doves, and at last a crowd of all the birds under heaven, chirping and fluttering, and they alighted among the ashes; and the doves nodded with their heads, and began to pick, peck, pick, peck, and then all the others began to pick, peck, pick, peck, and put all the good grains into the dish. Before an hour was over all was done, and they flew away.",
            "Then the maiden brought the dish to her step-mother, feeling joyful, and thinking that now she should go to the feast; but the step-mother said, \"No, Cinderella, you have no proper clothes, and you do not know how to dance, and you would be laughed at!\" And when Cinderella cried for disappointment, she added, \"If you can pick two dishes full of lentils out of the ashes, nice and clean, you shall go with us,\" thinking to herself, \"for that is not possible.\" When she had strewed two dishes full of lentils among the ashes the maiden went through the back-door into the garden, and cried,\"O gentle doves, O turtle-doves, And all the birds that be, The lentils that in ashes lie Come and pick up for me! The good must be put in the dish, The bad you may eat if you wish.\"",
            "So there came to the kitchen-window two white doves, and then some turtledoves, and at last a crowd of all the other birds under heaven, chirping and fluttering, and they alighted among the ashes, and the doves nodded with their heads and began to pick, peck, pick, peck, and then all the others began to pick, peck, pick, peck, and put all the good grains into the dish. And before half-anhour was over it was all done, and they flew away. Then the maiden took the dishes to the step-mother, feeling joyful, and thinking that now she should go with them to the feast; but she said, \"All this is of no good to you; you cannot come with us, for you have no proper clothes, and cannot dance; you would put us to shame.\" Then she turned her back on poor Cinderella and made haste to set out with her two proud daughters.",
            "And as there was no one left in the house, Cinderella went to her mother's grave, under the hazel bush, and cried, \"Little tree, little tree, shake over me, That silver and gold may come down and cover me.\"",
            "Then the bird threw down a dress of gold and silver, and a pair of slippers embroidered with silk and silver. And in all haste she put on the dress and went to the festival. But her step-mother and sisters did not know her, and thought she must be a foreign Princess, she looked so beautiful in her golden dress. Of Cinderella they never thought at all, and supposed that she was sitting at home, and picking the lentils out of the ashes. The King's son came to meet her, and took her by the hand and danced with her, and he refused to stand up with any one else, so that he might not be obliged to let go her hand; and when any one came to claim it he answered, \"She is my partner.\" And when the evening came she wanted to go home, but the Prince said he would go with her to take care of her, for he wanted to see where the beautiful maiden lived. But she escaped him, and jumped up into the pigeon-house. Then the Prince waited until the father came, and told him the strange maiden had jumped into the pigeon-house. The father thought to himself, \"It surely cannot be Cinderella,\" and called for axes and hatchets, and had the pigeon-house cut down, but there was no one in it. And when they entered the house there sat Cinderella in her dirty clothes among the cinders, and a little oillamp burnt dimly in the chimney; for Cinderella had been very quick, and had jumped out of the pigeon-house again, and had run to the hazel bush; and there she had taken off her beautiful dress and had laid it on the grave, and the bird had carried it away again, and then she had put on her little gray kirtle again, and had sat down in the kitchen among the cinders.",
    };
    private static final String[] harry={
            "THE BOY WHO LIVED\n" +
                    " \n" +
                    "      Mr. and Mrs. Dursley, of number four, Privet Drive, were proud to say that they were perfectly normal, thank you very much. They were the last people you'd expect to be involved in anything strange or mysterious, because they just didn't hold with such nonsense.\n" +
                    "      Mr. Dursley was the director of a firm called Grunnings, which made drills. He was a big, beefy man with hardly any neck, although he did have a very large mustache. Mrs. Dursley was thin and blonde and had nearly twice the usual amount of neck, which came in very useful as she spent so much of her time craning over garden fences, spying on the neighbors. The Dursleys had a small son called Dudley and in their opinion there was no finer boy anywhere.\n" +
                    "      The Dursleys had everything they wanted, but they also had a secret, and their greatest fear was that somebody would discover it. They didn't think they could bear it if anyone found out about the Potters. Mrs. Potter was Mrs. Dursley's sister, but they hadn't met for several years; in fact, Mrs. Dursley pretended she didn't have a sister, because her sister and her good-for-nothing husband were as unDursleyish as it was possible to be. The Dursleys shuddered to think what the neighbors would say if the Potters arrived in the street. The Dursleys knew that the Potters had a small son, too, but they had never even seen him. This boy was another good reason for keeping the Potters away; they didn't want Dudley mixing with a child like that.\n" +
                    "      When Mr. and Mrs. Dursley woke up on the dull, gray Tuesday our story starts, there was nothing about the cloudy sky outside to suggest that strange and mysterious things would soon be happening all over the country. Mr. Dursley hummed as he picked out his most boring tie for work, and Mrs. Dursley gossiped away happily as she wrestled a screaming Dudley into his high chair.\n" +
                    "      None of them noticed a large, tawny owl flutter past the window.",
            " At half past eight, Mr. Dursley picked up his briefcase, pecked Mrs. Dursley on the cheek, and tried to kiss Dudley good-bye but missed, because Dudley was now having a tantrum and throwing his cereal at the walls.\n" +
                    "\"Little tyke,\" chortled Mr. Dursley as he left the house. He got into his car and backed out of number four's drive.\n" +
                    "      It was on the corner of the street that he noticed the first sign of something peculiar - a cat reading a map. For a second, Mr. Dursley didn't realize what he had seen - then he jerked his head around to look again. There was a tabby cat standing on the corner of Privet Drive, but there wasn't a map in sight. What could he have been thinking of? It must have been a trick of the light. Mr. Dursley blinked and stared at the cat. It stared back. As Mr. Dursley drove around the corner and up the road, he watched the cat in his mirror. It was now reading the sign that said Privet Drive - no, looking at the sign; cats couldn't read maps or signs. Mr. Dursley gave himself a little shake and put the cat out of his mind. As he drove toward town he thought of nothing except a large order of drills he was hoping to get that day.\n" +
                    "      But on the edge of town, drills were driven out of his mind by something else. As he sat in the usual morning traffic jam, he couldn't help noticing that there seemed to be a lot of strangely dressed people about. People in cloaks. Mr. Dursley couldn't bear people who dressed in funny clothes - the getups you saw on young people! He supposed this was some stupid new fashion. He drummed his fingers on the steering wheel and his eyes fell on a huddle of these weirdos standing quite close by. They were whispering excitedly together. Mr. Dursley was enraged to see that a couple of them weren't young at all; why, that man had to be older than he was, and wearing an emerald-green cloak! The nerve of him! But then it struck Mr. Dursley that this was probably some silly stunt -these people were obviously collecting for something...yes, that would be it. The traffic moved on and a few minutes later, Mr. Dursley arrived in the Grunnings parking lot, his mind back on drills.",
            " Mr. Dursley always sat with his back to the window in his office on the ninth floor. If he hadn't, he might have found it harder to concentrate on drills that morning. He didn't see the owls swooping past in broad daylight, though people down in the street did; they pointed and gazed open-mouthed as owl after owl sped overhead. Most of them had never seen an owl even at nighttime. Mr. Dursley, however, had a perfectly normal, owl-free morning. He yelled at five different people. He made several important telephone calls and shouted a bit more. He was in a very good mood until lunchtime, when he thought he'd stretch his legs and walk across the road to buy himself a bun from the bakery.\n" +
                    "      He'd for gotten all about the people in cloaks until he passed a group of them next to the baker's. He eyed them angrily as he passed. He didn't know why, but they made him uneasy. This bunch were whispering excitedly, too, and he couldn't see a single collecting tin. It was on his way back past them, clutching a large doughnut in a bag, that he caught a few words of what they were saying.\n" +
                    "      \"The Potters, that's right, that's what I heard -\"\n" +
                    "      \" - yes, their son, Harry -\"\n" +
                    "      Mr. Dursley stopped dead. Fear flooded him. He looked back at the whisperers as if he wanted to say something to them, but thought better of it.\n" +
                    "      He dashed back across the road, hurried up to his office, snapped at his secretary not to disturb him, seized his telephone, and had almost finished dialing his home number when he changed his mind. He put the receiver back down and stroked his mustache, thinking...no, he was being stupid. Potter wasn't such an unusual name. He was sure there were lots of people called Potter who had a son called Harry. Come to think of it, he wasn't even sure his nephew was called Harry. He'd never even seen the boy. It might have been Harvey. Or Harold. There was no point in worrying Mrs. Dursley; she always got so upset at any mention of her sister. He didn't blame her - if he'd had a sister like that...but all the same, those people in cloaks....",
            "He found it a lot harder to concentrate on drills that afternoon and when he left the building at five o'clock, he was still so worried that he walked straight into someone just outside the door.\n" +
                    "      \"Sorry,\" he grunted, as the tiny old man stumbled and almost fell. It was a few seconds before Mr. Dursley realized that the man was wearing a violet cloak. He didn't seem at all upset at being almost knocked to the ground. On the contrary, his face split into a wide smile and he said in a squeaky voice that made passersby stare, \"Don't be sorry, my dear sir, for nothing could upset me today! Rejoice, for You-Know-Who has gone at last! Even Muggles like yourself should be celebrating, this happy, happy day!\"\n" +
                    "      And the old man hugged Mr. Dursley around the middle and walked off.\n" +
                    "      Mr. Dursley stood rooted to the spot. He had been hugged by a complete stranger. He also thought he had been called a Muggle, whatever that was. He was rattled. He hurried to his car and set off for home, hoping he was imagining things, which he had never hoped before, because he didn't approve of imagination.\n" +
                    "      As he pulled into the driveway of number four, the first thing he saw - and it didn't improve his mood - was the tabby cat he'd spotted that morning. It was now sitting on his garden wall. He was sure it was the same one; it had the same markings around its eyes.\n" +
                    "      \"Shoo!\" said Mr. Dursley loudly.\n" +
                    "      The cat didn't move. It just gave him a stern look. Was this normal cat behavior? Mr. Dursley wondered. Trying to pull himself together, he let himself into the house. He was still determined not to mention anything to his wife.\n" +
                    "      Mrs. Dursley had had a nice, normal day. She told him over dinner all about Mrs. Next Door's problems with her daughter and how Dudley had learned a new word (\"Won't!\"). Mr. Dursley tried to act normally. When Dudley had been put to bed, he went into the living room in time to catch the last report on the evening news:",
            "\"And finally, bird-watchers everywhere have reported that the nation's owls have been behaving very unusually today. Although owls normally hunt at night and are hardly ever seen in daylight, there have been hundreds of sightings of these birds flying in every direction since sunrise. Experts are unable to explain why the owls have suddenly changed their sleeping pattern.\" The newscaster allowed himself a grin. \"Most mysterious. And now, over to Jim McGuffin with the weather. Going to be any more showers of owls tonight, Jim?\"\n" +
                    "      \"Well, Ted,\" said the weatherman, \"I don't know about that, but it's not only the owls that have been acting oddly today. Viewers as far apart as Kent, Yorkshire, and Dundee have been phoning in to tell me that instead of the rain I promised yesterday, they've had a downpour of shooting stars! Perhaps people have been celebrating Bonfire Night early - it's not until next week, folks! But I can promise a wet night tonight.\"\n" +
                    "      Mr. Dursley sat frozen in his armchair. Shooting stars all over Britain? Owls flying by daylight? Mysterious people in cloaks all over the place? And a whisper, a whisper about the Potters....\n" +
                    "      Mrs. Dursley came into the living room carrying two cups of tea. It was no good. He'd have to say something to her. He cleared his throat nervously. \"Er - Petunia, dear - you haven't heard from your sister lately, have you?\"\n" +
                    "      As he had expected, Mrs. Dursley looked shocked and angry. After all, they normally pretended she didn't have a sister.\n" +
                    "      \"No,\" she said sharply. \"Why?\"",
            "\"Funny stuff on the news,\" Mr. Dursley mumbled. \"Owls...shooting stars...and there were a lot of funny-looking people in town today....\"\n" +
                    "      \"So?\" snapped Mrs. Dursley.\n" +
                    "      \"Well, I just thought...maybe...it was something to do with...you know...her crowd.\"\n" +
                    "      Mrs. Dursley sipped her tea through pursed lips. Mr. Dursley wondered whether he dared tell her he'd heard the name \"Potter.\" He decided he didn't dare. Instead he said, as casually as he could, \"Their son - he'd be about Dudley's age now, wouldn't he?\"\n" +
                    "      \"I suppose so,\" said Mrs. Dursley stiffly.\n" +
                    "      \"What's his name again? Howard, isn't it?\"\n" +
                    "      \"Harry. Nasty, common name, if you ask me.\"\n" +
                    "      \"Oh, yes,\" said Mr. Dursley, his heart sinking horribly. \"Yes, I quite agree.\"\n" +
                    "      He didn't say another word on the subject as they went upstairs to bed. While Mrs. Dursley was in the bathroom, Mr. Dursley crept to the bedroom window and peered down into the front garden. The cat was still there. It was staring down Privet Drive as though it were waiting for something.\n" +
                    "      Was he imagining things? Could all this have anything to do with the Potters? If it did...if it got out that they were related to a pair of - well, he didn't think he could bear it.\n" +
                    "      The Dursleys got into bed. Mrs. Dursley fell asleep quickly but Mr. Dursley lay awake, turning it all over in his mind. His last, comforting thought before he fell asleep was that even if the Potters were involved, there was no reason for them to come near him and Mrs. Dursley. The Potters knew very well what he and Petunia thought about them and their kind....He couldn't see how he and Petunia could get mixed up in anything that might be going on - he yawned and turned over - it couldn't affect them....",
            "How very wrong he was.\n" +
                    "      Mr. Dursley might have been drifting into an uneasy sleep, but the cat on the wall outside was showing no sign of sleepiness. It was sitting as still as a statue, its eyes fixed unblinkingly on the far corner of Privet Drive. It didn't so much as quiver when a car door slammed on the next street, nor when two owls swooped overhead. In fact, it was nearly midnight before the cat moved at all.\n" +
                    "      A man appeared on the corner the cat had been watching, appeared so suddenly and silently you'd have thought he'd just popped out of the ground. The cat's tail twitched and its eyes narrowed.\n" +
                    "      Nothing like this man had ever been seen on Privet Drive. He was tall, thin, and very old, judging by the silver of his hair and beard, which were both long enough to tuck into his belt. He was wearing long robes, a purple cloak that swept the ground, and high-heeled, buckled boots. His blue eyes were light, bright, and sparkling behind half-moon spectacles and his nose was very long and crooked, as though it had been broken at least twice. This man's name was Albus Dumbledore.\n" +
                    "      Albus Dumbledore didn't seem to realize that he had just arrived in a street where everything from his name to his boots was unwelcome. He was busy rummaging in his cloak, looking for something. But he did seem to realize he was being watched, because he looked up suddenly at the cat, which was still staring at him from the other end of the street. For some reason, the sight of the cat seemed to amuse him. He chuckled and muttered, \"I should have known.\"",
            "because he looked up suddenly at the cat, which was still staring at him from the other end of the street. For some reason, the sight of the cat seemed to amuse him. He chuckled and muttered, \"I should have known.\"\n" +
                    "      He found what he was looking for in his inside pocket. It seemed to be a silver cigarette lighter. He flicked it open, held it up in the air, and clicked it. The nearest street lamp went out with a little pop. He clicked it again - the next lamp flickered into darkness. Twelve times he clicked the Put-Outer, until the only lights left on the whole street were two tiny pinpricks in the distance, which were the eyes of the cat watching him. If anyone looked out of their window now, even beady-eyed Mrs. Dursley, they wouldn't be able to see anything that was happening down on the pavement. Dumbledore slipped the Put-Outer back inside his cloak and set off down the street toward number four, where he sat down on the wall next to the cat. He didn't look at it, but after a moment he spoke to it.\n" +
                    "      \"Fancy seeing you here, Professor McGonagall.\"\n" +
                    "      He turned to smile at the tabby, but it had gone. Instead he was smiling at a rather severe-looking woman who was wearing square glasses exactly the shape of the markings the cat had had around its eyes. She, too, was wearing a cloak, an emerald one. Her black hair was drawn into a tight bun. She looked distinctly ruffled.\n" +
                    "      \"How did you know it was me?\" she asked.\n" +
                    "      \"My dear Professor, I've never seen a cat sit so stiffly.\"\n" +
                    "      \"You'd be stiff if you'd been sitting on a brick wall all day,\" said Professor McGonagall.\n" +
                    "      \"All day? When you could have been celebrating? I must have passed a dozen feasts and parties on my way here.\"\n" +
                    "      Professor McGonagall sniffed angrily.",
            "\"Oh yes, I've celebrating, all right,\" she said impatiently. \"You'd think they'd be a bit more careful, but no -even the Muggles have noticed something's going on. It was on their news.\" She jerked her head back at the Dursleys' dark living-room window. \"I heard it. Flocks of owls...shooting stars...Well, they're not completely stupid. They were bound to notice something. Shooting stars down in Kent - I'll bet that was Dedalus Diggle. He never had much sense.\"\n" +
                    "      \"You can't blame them,\" said Dumbledore gently. \"We've had precious little to celebrate for eleven years.\"\n" +
                    "      \"I know that,\" said Professor McGonagall irritably. \"But that's no reason to lose our heads. People are being downright careless, out on the streets in broad daylight, not even dressed in Muggle clothes, swapping rumors.\"\n" +
                    "      She threw a sharp, sideways glance at Dumbledore here, as though hoping he was going to tell her something, but he didn't, so she went on. \"A fine thing it would be if, on the very day You-Know-Who seems to have disappeared at last, the Muggles found out about us all. I suppose he really has gone, Dumbledore?\"\n" +
                    "      \"It certainly seems so,\" said Dumbledore. \"We have much to be thankful for. Would you care for a lemon drop?\"\n" +
                    "      \"A what?\"",
            "\"A lemon drop. They're a kind of Muggle sweet I'm rather fond of.\"\n" +
                    "      \"No, thank you,\" said Professor McGonagall coldly, as though she didn't think this was the moment for lemon drops. \"As I say, even if You-Know-Who has gone -\"\n" +
                    "      \"My dear Professor, surely a sensible person like yourself can call him by his name? All this 'You-Know-Who' nonsense - for eleven years I have been trying to persuade people to call him by his proper name: Voldemort.\" Professor McGonagall flinched, but Dumbledore, who was unsticking two lemon drops, seemed not to notice. \"It all gets so confusing if we keep saying 'You-Know-Who.' I have never seen any reason to be frightened of saying Voldemort's name.\"\n" +
                    "      \"I know you haven't, said Professor McGonagall, sounding half exasperated, half admiring. \"But you're different. Everyone knows you're the only one You-Know- oh, all right, Voldemort, was frightened of.\"\n" +
                    "      \"You flatter me,\" said Dumbledore calmly. \"Voldemort had powers I will never have.\"\n" +
                    "      \"Only because you're too - well - noble to use them.\"\n" +
                    "      \"It's lucky it's dark. I haven't blushed so much since Madam Pomfrey told me she liked my new earmuffs.\"\n" +
                    "      Professor McGonagall shot a sharp look at Dumbledore and said \"The owls are nothing next to the rumors that are flying around. You know what they're saying? About why he's disappeared? About what finally stopped him?\"",
    };
    private static final String[] sw={
            "Once upon a time . . . in a great castle, a Prince's daughter grew up happy and contented, in spite of a jealous stepmother. She was very pretty, with blue eyes and long black hair. Her skin was delicate and fair, and so she was called Snow White. Everyone was quite sure she would become very beautiful. Though her stepmother was a wicked woman, she too was very beautiful, and the magic mirror told her this every day, whenever she asked it.\n" +
                    "\"Mirror, mirror on the wall, who is the loveliest lady in the land?\" The reply was always; \"You are, your Majesty,\" until the dreadful day when she heard it say, \"Snow White is the loveliest in the land.\" The stepmother was furious and, wild with jealousy, began plotting to get rid of her rival. Calling one of her trusty servants, she bribed him with a rich reward to take Snow White intc the forest, far away from the Castle. Then, unseen, he was to put her to death. The greedy servant, attracted to the reward, agreed to do this deed, and he led the innocent little girl away. However, when they came to the fatal spot, the man's courage failed him and, leaving Snow White sitting beside a tree, he mumbled an excuse and ran off. Snow White was all alone in the forest.",
            "Night came, but the servant did not return. Snow White, alone in the dark forest, began to cry bitterly. She thought she could feel terrible eyes spying on her, and she heard strange sounds and rustlings that made her heart thump. At last, overcome by tiredness, she fell asleep curled under a tree.\n" +
                    "\n" +
                    "Snow White slept fitfully, wakening from time to time with a start and staring into the darkness round her. Several times, she thought she felt something, or somebody touch her as she slept.\n" +
                    "\n" +
                    "At last, dawn woke the forest to the song of the birds, and Snow White too, awoke. A whole world was stirring to life and the little girl was glad to see how silly her fears had been. However, the thick trees were like a wall round her, and as she tried to find out where she was, she came upon a path. She walked along it, hopefully. On she walked till she came to a clearing. There stood a strange cottage, with a tiny door, tiny windows and a tiny chimney pot. Everything about the cottage was much tinier than it ought to be. Snow White pushed the door open.",
            "\"l wonder who lives here?\" she said to herself, peeping round the kitchen. \"What tiny plates! And spoons! There must be seven of them, the table's laid for seven people.\" Upstairs was a bedroom with seven neat little beds. Going back to the kitchen, Snow White had an idea.\n" +
                    "\n" +
                    "\"I'll make them something to eat. When they come home, they'll be glad to find a meal ready.\" Towards dusk, seven tiny men marched homewards singing. But when they opened the door, to their surprise they found a bowl of hot steaming soup on the table, and the whole house spick and span. Upstairs was Snow White, fast asleep on one of the beds. The chief dwarf prodded her gently.",
            "\"Who are you?\" he asked. Snow White told them her sad story, and tears sprang to the dwarfs' eyes. Then one of them said, as he noisily blew his nose:\n" +
                    "\n" +
                    "\"Stay here with us!\"\n" +
                    "\n" +
                    "\"Hooray! Hooray!\" they cheered, dancing joyfully round the little girl. The dwarfs said to Snow White:\n" +
                    "\n" +
                    "\"You can live here and tend to the house while we're down the mine. Don't worry about your stepmother leaving you in the forest. We love you and we'll take care of you!\" Snow White gratefully accepted their hospitality, and next morning the dwarfs set off for work. But they warned Snow White not to open the door to strangers.",
            "Meanwhile, the servant had returned to the castle, with the heart of a roe deer. He gave it to the cruel stepmother, telling her it belonged to Snow White, so that he could claim the reward. Highly pleased, the stepmother turned again to the magic mirror. But her hopes were dashed, for the mirror replied: \"The loveliest in the land is still Snow White, who lives in the seven dwarfs' cottage, down in the forest.\" The stepmother was beside herself with rage.\n" +
                    "\n" +
                    "\"She must die! She must die!\" she screamed. Disguising herself as an old peasant woman, she put a poisoned apple with the others in her basket. Then, taking the quickest way into the forest, she crossed the swamp at the edge of the trees. She reached the bank unseen, just as Snow White stood waving goodbye to the seven dwarfs on their way to the mine.\n" +
                    "\n" +
                    "Snow White was in the kitchen when she heard the sound at the door: KNOCK! KNOCK!",
            "\"Who's there?\" she called suspiciously, remembering the dwarfs advice.\n" +
                    "\n" +
                    "\"I'm an old peasant woman selling apples,\" came the reply.\n" +
                    "\n" +
                    "\"I don't need any apples, thank you,\" she replied.\n" +
                    "\n" +
                    "\"But they are beautiful apples and ever so juicy!\" said the velvety voice from outside the door.\n" +
                    "\n" +
                    "\"I'm not supposed to open the door to anyone,\" said the little girl, who was reluctant to disobey her friends.",
            "\"And quite right too! Good girl! If you promised not to open up to strangers, then of course you can't buy. You are a good girl indeed!\" Then the old woman went on.\n" +
                    "\n" +
                    "\"And as a reward for being good, I'm going to make you a gift of one of my apples!\" Without a further thought, Snow White opened the door just a tiny crack, to take the apple.\n" +
                    "\n" +
                    "\"There! Now isn't that a nice apple?\" Snow White bit into the fruit, and as she did, fell to the ground in a faint: the effect of the terrible poison left her lifeless instantaneously.",
            "Now chuckling evilly, the wicked stepmother hurried off. But as she ran back across the swamp, she tripped and fell into the quicksand. No one heard her cries for help, and she disappeared without a trace.\n" +
                    "\n" +
                    "Meanwhile, the dwarfs came out of the mine to find the sky had grown dark and stormy. Loud thunder echoed through the valleys and streaks of lightning ripped the sky. Worried about Snow White they ran as quickly as they could down the mountain to the cottage.\n" +
                    "\n" +
                    "There they found Snow White, lying still and lifeless, the poisoned apple by her side. They did their best to bring her around, but it was no use.",
            "They wept and wept for a long time. Then they laid her on a bed of rose petals, carried her into the forest and put her in a crystal coffin.\n" +
                    "\n" +
                    "Each day they laid a flower there.\n" +
                    "\n" +
                    "Then one evening, they discovered a strange young man admiring Snow White's lovely face through the glass. After listening to the story, the Prince (for he was a prince!) made a suggestion.",
            "\"If you allow me to take her to the Castle, I'll call in famous doctors to waken her from this peculiar sleep. She's so lovely . . . I'd love to kiss her. . . !\" He did, and as though by magic, the Prince's kiss broke the spell. To everyone's astonishment, Snow White opened her eyes. She had amazingly come back to life! Now in love, the Prince asked Snow White to marry him, and the dwarfs reluctantly had to say good bye to Snow White.\n" +
                    "\n" +
                    "From that day on, Snow White lived happily in a great castle. But from time to time, she was drawn back to visit the little cottage down in the forest.",
    };
    private static final String[] batb={
            "There was once a very rich merchant, who had six children, three sons, and three daughters; being a man of sense, he spared no cost for their education, but gave them all kinds of masters. His daughters were extremely handsome, especially the youngest. When she was little everybody admired her, and called her \"The little Beauty;\" so that, as she grew up, she still went by the name of Beauty, which made her sisters very jealous.\n" +
                    "\n" +
                    "The youngest, as she was handsomer, was also better than her sisters. The two eldest had a great deal of pride, because they were rich. They gave themselves ridiculous airs, and would not visit other merchants' daughters, nor keep company with any but persons of quality. They went out every day to parties of pleasure, balls, plays, concerts, and so forth, and they laughed at their youngest sister, because she spent the greatest part of her time in reading good books.",
            "As it was known that they were great fortunes, several eminent merchants made their addresses to them; but the two eldest said, they would never marry, unless they could meet with a duke, or an earl at least. Beauty very civilly thanked them that courted her, and told them she was too young yet to marry, but chose to stay with her father a few years longer.\n" +
                    "\n" +
                    "All at once the merchant lost his whole fortune, excepting a small country house at a great distance from town, and told his children with tears in his eyes, they must go there and work for their living. The two eldest answered, that they would not leave the town, for they had several lovers, who they were sure would be glad to have them, though they had no fortune; but the good ladies were mistaken, for their lovers slighted and forsook them in their poverty. As they were not beloved on account of their pride, everybody said; they do not deserve to be pitied, we are very glad to see their pride humbled, let them go and give themselves quality airs in milking the cows and minding their dairy. But, added they, we are extremely concerned for Beauty, she was such a charming, sweet-tempered creature, spoke so kindly to poor people, and was of such an affable, obliging behavior. Nay, several gentlemen would have married her, though they knew she had not a penny; but she told them she could not think of leaving her poor father in his misfortunes, but was determined to go along with him into the country to comfort and attend him. Poor Beauty at first was sadly grieved at the loss of her fortune; \"but,\" said she to herself, \"were I to cry ever so much, that would not make things better, I must try to make myself happy without a fortune.\"",
            "When they came to their country house, the merchant and his three sons applied themselves to husbandry and tillage; and Beauty rose at four in the morning, and made haste to have the house clean, and dinner ready for the family. In the beginning she found it very difficult, for she had not been used to work as a servant, but in less than two months she grew stronger and healthier than ever. After she had done her work, she read, played on the harpsichord, or else sung whilst she spun.\n" +
                    "\n" +
                    "On the contrary, her two sisters did not know how to spend their time; they got up at ten, and did nothing but saunter about the whole day, lamenting the loss of their fine clothes and acquaintance. \"Do but see our youngest sister,\" said they, one to the other, \"what a poor, stupid, mean-spirited creature she is, to be contented with such an unhappy dismal situation.\"\n" +
                    "\n" +
                    "The good merchant was of quite a different opinion; he knew very well that Beauty outshone her sisters, in her person as well as her mind, and admired her humility and industry, but above all her humility and patience; for her sisters not only left her all the work of the house to do, but insulted her every moment.",
            "The family had lived about a year in this retirement, when the merchant received a letter with an account that a vessel, on board of which he had effects, was safely arrived. This news had liked to have turned the heads of the two eldest daughters, who immediately flattered themselves with the hopes of returning to town, for they were quite weary of a country life; and when they saw their father ready to set out, they begged of him to buy them new gowns, headdresses, ribbons, and all manner of trifles; but Beauty asked for nothing for she thought to herself, that all the money her father was going to receive, would scarce be sufficient to purchase everything her sisters wanted.\n" +
                    "\n" +
                    "\"What will you have, Beauty?\" said her father.",
            "\"Since you have the goodness to think of me,\" answered she, \"be so kind to bring me a rose, for as none grows hereabouts, they are a kind of rarity.\" Not that Beauty cared for a rose, but she asked for something, lest she should seem by her example to condemn her sisters' conduct, who would have said she did it only to look particular.\n" +
                    "\n" +
                    "The good man went on his journey, but when he came there, they went to law with him about the merchandise, and after a great deal of trouble and pains to no purpose, he came back as poor as before.",
            "He was within thirty miles of his own house, thinking on the pleasure he should have in seeing his children again, when going through a large forest he lost himself. It rained and snowed terribly; besides, the wind was so high, that it threw him twice off his horse, and night coming on, he began to apprehend being either starved to death with cold and hunger, or else devoured by the wolves, whom he heard howling all round him, when, on a sudden, looking through a long walk of trees, he saw a light at some distance, and going on a little farther perceived it came from a palace illuminated from top to bottom. The merchant returned God thanks for this happy discovery, and hastened to the place, but was greatly surprised at not meeting with any one in the outer courts. His horse followed him, and seeing a large stable open, went in, and finding both hay and oats, the poor beast, who was almost famished, fell to eating very heartily; the merchant tied him up to the manger, and walking towards the house, where he saw no one, but entering into a large hall, he found a good fire, and a table plentifully set out with but one cover laid. As he was wet quite through with the rain and snow, he drew near the fire to dry himself. \"I hope,\" said he, \"the master of the house, or his servants will excuse the liberty I take; I suppose it will not be long before some of them appear.\"",
            "He waited a considerable time, until it struck eleven, and still nobody came. At last he was so hungry that he could stay no longer, but took a chicken, and ate it in two mouthfuls, trembling all the while. After this he drank a few glasses of wine, and growing more courageous he went out of the hall, and crossed through several grand apartments with magnificent furniture, until he came into a chamber, which had an exceeding good bed in it, and as he was very much fatigued, and it was past midnight, he concluded it was best to shut the door, and go to bed.\n" +
                    "\n" +
                    "It was ten the next morning before the merchant waked, and as he was going to rise he was astonished to see a good suit of clothes in the room of his own, which were quite spoiled; certainly, said he, this palace belongs to some kind fairy, who has seen and pitied my distress. He looked through a window, but instead of snow saw the most delightful arbors, interwoven with the beautifullest flowers that were ever beheld. He then returned to the great hall, where he had supped the night before, and found some chocolate ready made on a little table. \"Thank you, good Madam Fairy,\" said he aloud, \"for being so careful, as to provide me a breakfast; I am extremely obliged to you for all your favors.\"",
            "The good man drank his chocolate, and then went to look for his horse, but passing through an arbor of roses he remembered Beauty's request to him, and gathered a branch on which were several; immediately he heard a great noise, and saw such a frightful Beast coming towards him, that he was ready to faint away.\n" +
                    "\n" +
                    "\"You are very ungrateful,\" said the Beast to him, in a terrible voice; \"I have saved your life by receiving you into my castle, and, in return, you steal my roses, which I value beyond any thing in the universe, but you shall die for it; I give you but a quarter of an hour to prepare yourself, and say your prayers.\"\n" +
                    "\n" +
                    "The merchant fell on his knees, and lifted up both his hands, \"My lord,\" said he, \"I beseech you to forgive me, indeed I had no intention to offend in gathering a rose for one of my daughters, who desired me to bring her one.\"",
            "\"My name is not My Lord,\" replied the monster, \"but Beast; I don't love compliments, not I. I like people to speak as they think; and so do not imagine, I am to be moved by any of your flattering speeches. But you say you have got daughters. I will forgive you, on condition that one of them come willingly, and suffer for you. Let me have no words, but go about your business, and swear that if your daughter refuse to die in your stead, you will return within three months.\"\n" +
                    "\n" +
                    "The merchant had no mind to sacrifice his daughters to the ugly monster, but he thought, in obtaining this respite, he should have the satisfaction of seeing them once more, so he promised, upon oath, he would return, and the Beast told him he might set out when he pleased, \"but,\" added he, \"you shall not depart empty handed; go back to the room where you lay, and you will see a great empty chest; fill it with whatever you like best, and I will send it to your home,\" and at the same time Beast withdrew.",
            "\"Well,\" said the good man to himself, \"if I must die, I shall have the comfort, at least, of leaving something to my poor children.\" He returned to the bedchamber, and finding a great quantity of broad pieces of gold, he filled the great chest the Beast had mentioned, locked it, and afterwards took his horse out of the stable, leaving the palace with as much grief as he had entered it with joy. The horse, of his own accord, took one of the roads of the forest, and in a few hours the good man was at home.\n" +
                    "\n" +
                    "His children came round him, but instead of receiving their embraces with pleasure, he looked on them, and holding up the branch he had in his hands, he burst into tears. \"Here, Beauty,\" said he, \"take these roses, but little do you think how dear they are like to cost your unhappy father,\" and then related his fatal adventure. Immediately the two eldest set up lamentable outcries, and said all manner of ill-natured things to Beauty, who did not cry at all.\n" +
                    "\n" +
                    "\"Do but see the pride of that little wretch,\" said they; \"she would not ask for fine clothes, as we did; but no truly, Miss wanted to distinguish herself, so now she will be the death of our poor father, and yet she does not so much as shed a tear.\"",
    };
    private static final String[] rapunzel={
            "There were once a man and a woman who had long, in vain, wished for a child. At length it appeared that God was about to grant their desire.\n" +
                    "\n" +
                    "     These people had a little window at the back of their house from which a splendid garden could be seen, which was full of the most beautiful flowers and herbs. It was, however, surrounded by a high wall, and no one dared to go into it because it belonged to an enchantress, who had great power and was dreaded by all the world.\n" +
                    "\n" +
                    "     One day the woman was standing by this window and looking down into the garden, when she saw a bed which was planted with the most beautiful rampion, and it looked so fresh and green that she longed for it. She quite pined away, and began to look pale and miserable.\n" +
                    "\n" +
                    "     Her husband was alarmed, and asked: 'What ails you, dear wife?'\n" +
                    "\n" +
                    "     'Ah,' she replied, 'if I can't eat some of the rampion, which is in the garden behind our house, I shall die.'",
            "The man, who loved her, thought: 'Sooner than let your wife die, bring her some of the rampion yourself, let it cost what it will.'\n" +
                    "\n" +
                    "     At twilight, he clambered down over the wall into the garden of the enchantress, hastily clutched a handful of rampion, and took it to his wife. She at once made herself a salad of it, and ate it greedily. It tasted so good to her - so very good, that the next day she longed for it three times as much as before.",
            "If he was to have any rest, her husband knew he must once more descend into the garden. Therefore, in the gloom of evening, he let himself down again; but when he had clambered down the wall he was terribly afraid, for he saw the enchantress standing before him.\n" +
                    "\n" +
                    "     'How can you dare,' said she with angry look, 'descend into my garden and steal my rampion like a thief? You shall suffer for it!'",
            " 'Ah,' answered he, 'let mercy take the place of justice, I only made up my mind to do it out of necessity. My wife saw your rampion from the window, and felt such a longing for it that she would have died if she had not got some to eat.'\n" +
                    "\n" +
                    "     The enchantress allowed her anger to be softened, and said to him: 'If the case be as you say, I will allow you to take away with you as much rampion as you will, only I make one condition, you must give me the child which your wife will bring into the world; it shall be well treated, and I will care for it like a mother.'",
            "The man in his terror consented to everything.\n" +
                    "\n" +
                    "     When the woman was brought to bed, the enchantress appeared at once, gave the child the name of Rapunzel, and took it away with her.\n" +
                    "\n" +
                    "     Rapunzel grew into the most beautiful child under the sun. When she was twelve years old, the enchantress shut her into a tower in the middle of a forest. The tower had neither stairs nor door, but near the top was a little window. When the enchantress wanted to go in, she placed herself beneath it and cried:\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "'Rapunzel, Rapunzel, \n" +
                    "Let down your hair to me.'",
            "Rapunzel had magnificent long hair, fine as spun gold, and when she heard the voice of the enchantress, she unfastened her braided tresses, wound them round one of the hooks of the window above, and then the hair fell twenty ells down, and the enchantress climbed up by it.",
            "   After a year or two, it came to pass that the king's son rode through the forest and passed by the tower. Then he heard a song, which was so charming that he stood still and listened. It was Rapunzel, who in her solitude passed her time in letting her sweet voice resound. The king's son wanted to climb up to her, and looked for the door of the tower, but none was to be found. He rode home, but the singing had so deeply touched his heart, that every day he went out into the forest and listened to it.",
            " Once when he was thus standing behind a tree, he saw that an enchantress came there, and he heard how she cried:\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "'Rapunzel, Rapunzel, \n" +
                    "Let down your hair to me.'\n" +
                    " \n" +
                    "\n" +
                    "     Then Rapunzel let down the braids of her hair, and the enchantress climbed up to her.",
            "  'If that is the ladder by which one mounts, I too will try my fortune,' said he, and the next day when it began to grow dark, he went to the tower and cried:\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "'Rapunzel, Rapunzel, \n" +
                    "Let down your hair to me.'\n" +
                    " \n" +
                    "\n" +
                    "     Immediately the hair fell down and the king's son climbed up.",
            "At first Rapunzel was terribly frightened when a man, such as her eyes had never yet beheld, came to her; but the king's son began to talk to her quite like a friend, and told her that his heart had been so stirred that it had let him have no rest, and he had been forced to see her. Then Rapunzel lost her fear, and when he asked her if she would take him for her husband, and she saw that he was young and handsome, she thought: 'He will love me more than old Dame Gothel does'; and she said yes, and laid her hand in his.",
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page);
        Intent intent=getIntent();
        int bookid=intent.getIntExtra("BooksID", R.id.harrypotter);
        int pagen=intent.getIntExtra("PagesID", 1);
        TextView t=(TextView) findViewById(R.id.textView7);
        ImageView iv=(ImageView) findViewById(R.id.imageviewpage);
        String tex;
        String s = null;
        Button b1=(Button)findViewById(R.id.button4);
        if(pagen==9)
        {
            b1.setText("Back");
        }
        if(bookid==R.id.cinderella) {
            Resources res = getResources();
            String mDrawableName = "cinde"+(pagen+1);
            int resID = res.getIdentifier(mDrawableName , "drawable", getPackageName());
            Drawable drawable = res.getDrawable(resID);
            iv.setImageDrawable(drawable );
            tex=cinde[pagen];
            try {
                s = URLDecoder.decode(tex, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        else if(bookid==R.id.harrypotter) {
            Resources res = getResources();
            String mDrawableName = "harry"+(pagen+1);
            int resID = res.getIdentifier(mDrawableName , "drawable", getPackageName());
            Drawable drawable = res.getDrawable(resID);
            iv.setImageDrawable(drawable );
            tex=harry[pagen];
            try {
                s = URLDecoder.decode(tex, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        else if(bookid==R.id.snowwhite) {
            Resources res = getResources();
            String mDrawableName = "sw"+(pagen+1);
            int resID = res.getIdentifier(mDrawableName , "drawable", getPackageName());
            Drawable drawable = res.getDrawable(resID);
            iv.setImageDrawable(drawable );
            tex = sw[pagen];
            try {
                s = URLDecoder.decode(tex, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        else if(bookid==R.id.batb) {
            Resources res = getResources();
            String mDrawableName = "batb"+(pagen+1);
            int resID = res.getIdentifier(mDrawableName , "drawable", getPackageName());
            Drawable drawable = res.getDrawable(resID);
            iv.setImageDrawable(drawable );
            tex=batb[pagen];
            try {
                s = URLDecoder.decode(tex, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        else if(bookid==R.id.rapunzel) {
            Resources res = getResources();
            String mDrawableName = "rapunzel"+(pagen+1);
            int resID = res.getIdentifier(mDrawableName , "drawable", getPackageName());
            Drawable drawable = res.getDrawable(resID);
            iv.setImageDrawable(drawable );
            tex=rapunzel[pagen];
            try {
                s = URLDecoder.decode(tex, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        t.setText(s);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void back(View view) {
        Intent intent= new Intent();
        setResult(RESULT_OK, intent);
        finish();
    }
    @Override
    public void onBackPressed() {
        Intent intent1=getIntent();
        int bookid=intent1.getIntExtra("BooksID",R.id.cinderella);
        Intent intent=new Intent(this,Books.class);
        intent.putExtra("BooksID",bookid);
        startActivity(intent);
    }
    public void nextpage(View view) {

        Intent intent1=getIntent();
        int bookid=intent1.getIntExtra("BooksID",R.id.cinderella);
        int pagen=intent1.getIntExtra("PagesID",1);
        if(pagen<9)
        {
            ++pagen;
            Intent intent=new Intent(this,Pages.class);
            intent.putExtra("BooksID",bookid);
            intent.putExtra("PagesID",pagen);
            startActivity(intent);
        }
        else
        {
            Intent intent=new Intent(this,Books.class);
            intent.putExtra("BooksID",bookid);
            startActivity(intent);
        }
    }
}
