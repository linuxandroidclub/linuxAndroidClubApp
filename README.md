<h1>Linux/Android Club App</h1>
<p>This application is made and maintained by the students in the Linux/Android club at the York campus of Seneca College.  The purpose of the application, at the point of inception, was to make it easier for the students to check for class cancelations, check timetables, have a map of the campus and check TTC arrival times around the campus.  We plan to add more features in the future.</p>
<h2>Feature list</h2>
<ul>
	<li>RSS reader for checking class cancelations <strong>(done)</strong></li>
	<li>TTC time arrivals <strong>(done)</strong></li>
	<li>Timetable entry <strong>(in progress)</strong></li>
	<li>Campus map <strong>(in progress)</strong></li>
</ul>
<h1>Tutorial for importing project into Eclipse</h1>
<p><strong>Disclamer:</strong> This tutorial was written based on the setup under Ubuntu 12.10, although if you are using a different operating system, the steps should be the same, but there are no garuntees. Also, if you are reading this from the <em>future</em>, the steps may have changed significantly. This tutorial was written on the 10th of January 2013.  And if the tutorial is updated by someone, they might forget to change the date.  Just saying.</p>
<h2>Assumptions made:</h2>
<ul>
	<li>You already have Java configured in your environment</li>
	<li>You already have Eclipse setup with the appropriate Android pulgin and SDKs</li>
	<li>You already have the EGit Github plugin for Eclipse</li>
	<li>You already have a <em>git</em> directory in your <em>Home</em> directory</li>
</ul>
<h2>The Tutorial:</h2>
<ol>
	<li><strong>Right click</strong> in the <strong>Package Explorer</strong> and <strong>click</strong> on <strong>Import</strong></li>
	<li><strong>Expand</strong> the <strong>Git</strong> category, select <strong>Projects from Git</strong> and click <strong>next</strong></li>
	<li>Select <strong>URI</strong> and click <strong>next</strong></li>
	(if you are not already on the repository page)
	<li>Go to this <a href="http://github.com/linuxandroidclub?tab=repositories">Github</a> page and select the <strong>linuxAndroidClubApp</strong> repository</li>
	<li><strong>Copy</strong> the <strong>URL</strong> provided under the <strong>Code tab</strong></li>
	<li><strong>Paste</strong> the <strong>URL</strong> into the <strong>URI</strong> field in the window and click <strong>next</strong></li>
	<li>Make sure <strong>master</strong> is <strong>selected</strong> and click <strong>next</strong></li>
	(This window should already have have the Directory field filled in, if not, point it your <em>git</em> directory)
	<li>Make sure the <strong>Directory</strong> field is pointed to the <em>git</em> directory with the <strong>application name</strong> at the end</li>
	<li>click <strong>next</strong></li>
	<li>Try selecting <strong>Import existing projects</strong> and clicking <strong>next</strong>. If the <strong>top</strong> of the next screen says <strong>No projects found</strong>, click <strong>back</strong> and move to <strong>step 11</strong> otherwise, select the <strong>project</strong> and click <strong>finish</strong></li>
	<li>Select <strong>Import as general project</strong>, click <strong>next</strong> and then click <strong>finish</strong></li>
	<li>Exit out of <strong>Eclipse</strong></li>
	<li>Navigate to the <strong>Directory</strong> where you <strong>saved</strong> your project</li>
	<li>Change the <strong>setting</strong> so you can see the <strong>hidden files</strong> in the directory</li>
	<li>Edit the <em>.project</em> file to include the lines below:</li>
	(Do not delete or add anything eles in the file. Just change the tags shown below)
	<pre>
		&lt;buildSpec&gt;
			&lt;buildCommand&gt;
				&lt;name&gt;com.android.ide.eclipse.adt.ResourceManagerBuilder&lt;/name&gt;
				&lt;arguments&gt;
				&lt;/arguments&gt;
			&lt;/buildCommand&gt;
			&lt;buildCommand&gt;
				&lt;name&gt;com.android.ide.eclipse.adt.PreCompilerBuilder&lt;/name&gt;
				&lt;arguments&gt;
				&lt;/arguments&gt;
			&lt;/buildCommand&gt;
			&lt;buildCommand&gt;
				&lt;name&gt;com.android.ide.eclipse.adt.ApkBuilder&lt;/name&gt;
				&lt;arguments&gt;
				&lt;/arguments&gt;
			&lt;/buildCommand&gt;
			&lt;buildCommand&gt;
				&lt;name&gt;org.eclipse.jdt.core.javabuilder&lt;/name&gt;
				&lt;arguments&gt;
				&lt;/arguments&gt;
			&lt;/buildCommand&gt;
		&lt;/buildSpec&gt;
		&lt;natures&gt;
			&lt;nature&gt;com.android.ide.eclipse.adt.AndroidNature&lt;/nature&gt;
			&lt;nature&gt;org.eclipse.jdt.core.javanature&lt;/nature&gt;
		&lt;/natures&gt;
	</pre>
	(If the above step is done correctly, there should be no errors.  If there are try to troubleshoot or restart the process)
	<li>Start <strong>Eclipse</strong> again</li>
	(The packages now look odd but don't worry that will be fixed)
	<li><strong>Right click</strong> on the <strong>project</strong> and click <strong>Properties</strong></li>
	<li>Select <strong>Java Build Path</strong> from the left panel</li>
	<li>Select the <strong>Libraries</strong> tab from the top and click <strong>Add Library</strong> from the button array on the right</li>
	<li>Select <strong>Android Classpath Container</strong> and click <strong>next</strong></li>
	<li>Make sure the project is <strong>selected</strong> in the <strong>Projects List</strong> and click <strong>finish</strong></li>
	<li>Click <strong>OK</strong> when you get back to the <strong>previous screen</strong></li>
	<li>Now the directories and packages should be organized like an anroid project</li>
	<li><strong>Right click</strong> on the <strong>project</strong></li>
	<li>Expand the <strong>Android Tools</strong> option and click <strong>Fix Project Properties</strong> to load Android Dependencies</li>
	<li>Done</li>
</ol>
